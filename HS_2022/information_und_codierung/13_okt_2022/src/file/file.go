package file

import (
	"entrpyAnalysis/src/characterCount"
	"fmt"
	"os"
)

type File struct {
	File *os.File
	Name string
	CurrentLetter string
	LetterData []characterCount.Character
	TotalCharacters         int
	TotalDistinctCharacters int
	Entropy float64
}

// TODO: consider reading the file in chunks and doing the analysis on these chunks instead of letter by letter

// Opens a file using the @param fileName
func (file *File) Open(fileName string) {
	var error error
	fmt.Printf("Opening %s...\n", fileName)

	file.File, error = os.Open(fileName)
	if error != nil { panic(error) }
	file.Name = fileName
}

func (file *File) Analyse() {
	fmt.Printf("Starting analysis of %s...\n", file.Name)

	var doesLetterExist bool

	// TODO: rework file reading to use the bufio.NewScanner()
	// Doing the analysis for each character
	for {
		// No character was read; end of file was reached; stop reading any more letters
		if file.readLettersIntoBuffer() < 1 { break }

		// ? Should this be here?
		// ~ It should only be here if we do not ignore any characters
		// file.TotalCharacters++

		// Ignoring whitespace and newline characters
		if file.ignoreCharacters([]string{" ", "\n"}) { continue }

		file.TotalCharacters++

		// Finding out if the characte that was read is unique or if it already exists
		doesLetterExist = false
		for i, letter := range file.LetterData { // Iterating over all existing LetterData objects

			// If the current character already exists in the LetterData array, update its data
			if file.CurrentLetter == letter.Character {
				doesLetterExist = true
				file.LetterData[i].IncrementCount()
				break
			}
		}

		// If the letter does not exist yet, a new one is created
		if !doesLetterExist {
			file.createNewCharacter(file.CurrentLetter)
		}
	}

	file.analyseCharacters()
}

func (file *File) PrintResults() {
	// Print the results of the letters
	for _, letter := range file.LetterData {
		fmt.Printf(
			"\"%s\": %6d times,\tP(%s) = %f,\tI(%s) = %f\n",
			letter.Character,
			letter.Count,
			letter.Character,
			letter.Probability,
			letter.Character,
			letter.InformationContent,
		)
	}

	// Print the results of the file
	fmt.Printf("H(%s) = %f\n", file.Name, file.Entropy)
	fmt.Printf(
		"%d characters with %d distinct symbols in %s.\n",
		file.TotalCharacters,
		file.TotalDistinctCharacters,
		file.Name,
	)
	fmt.Printf("Done analysis of %s. Closing file...\n\n", file.Name)
	file.File.Close()
}

func (file *File) analyseCharacters() {
	for i := range file.LetterData {
		file.LetterData[i].Analyse(file.TotalCharacters)
		file.Entropy += file.LetterData[i].Probability * file.LetterData[i].InformationContent
	}
}

func (file *File) ignoreCharacters(letters []string) bool {
	for _, letter := range letters {
		if file.CurrentLetter == letter { return true }
	}
	return false
}

// Reads a single character from the file
func (file *File) readLettersIntoBuffer() int {
	buffer := [1]byte{}

	// Reads a single character
	amount, error := file.File.Read(buffer[:])
	// In case something unexpected happens, the readign of the file is stopped
	if error != nil {
		// fmt.Println("  !#! Error:", error)
		return 0
	}

	file.CurrentLetter = string(buffer[:])
	return amount
}

func (file *File) createNewCharacter(letter string) {
	file.LetterData = append(
		file.LetterData,
		characterCount.Character{
			Character: string(letter),
			Count: 1,
			Probability: 0,
			InformationContent: 0,
		},
	)
	file.TotalDistinctCharacters++
}
