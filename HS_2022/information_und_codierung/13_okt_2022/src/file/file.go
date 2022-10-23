package file

import (
	"bufio"
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

// Opens a file using the @param fileName
func (file *File) Open(fileName string) {
	var fileOpeningError error
	fmt.Printf("Opening %s...\n", fileName)

	file.File, fileOpeningError = os.Open(fileName)
	if fileOpeningError != nil { panic(fileOpeningError) }
	file.Name = fileName
}

func (file *File) Read() {
	fmt.Printf("Starting analysis of %s...\n", file.Name)

	doesLetterExist := false

	fileScanner := bufio.NewScanner(file.File)
	fileScanner.Split(bufio.ScanBytes)

	// Reading each letter of the file
	for fileScanner.Scan() {

		doesLetterExist = false

		// Ignoring whitespace and newline characters
		if ignoreCharacter(fileScanner.Text(), []string{" ", "\n"}) { continue }

		// Finding out if the characte that was read is unique or if it already exists
		for i, letter := range file.LetterData {

			// If the current character already exists in the LetterData array, update its data
			if fileScanner.Text() == letter.Character {
				file.TotalCharacters++
				doesLetterExist = true
				file.LetterData[i].IncrementCount()
				break
			}
		}

		// The letter does not exist yet, creating a new one
		if !doesLetterExist {
			file.createNewCharacter(fileScanner.Text())
			file.TotalCharacters++
		}
	}
}

func (file *File) Analyse()  {
	for i := range file.LetterData {
		file.LetterData[i].Analyse(file.TotalCharacters)
		file.Entropy += file.LetterData[i].Probability * file.LetterData[i].InformationContent
	}
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
		"%d total characters with %d distinct symbols in %s.\n",
		file.TotalCharacters,
		file.TotalDistinctCharacters,
		file.Name,
	)
	fmt.Printf("Done analysis of %s. Closing file...\n\n", file.Name)
	file.File.Close()
}

func ignoreCharacter(currentLetter string, symbols []string) bool {
	for _, symbol := range symbols {
		// The current letter matches one of the symbols we want to ignroe
		if symbol == currentLetter { return true }
	}

	return false
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
