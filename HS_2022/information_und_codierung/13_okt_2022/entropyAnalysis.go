package main

import (
	"entrpyAnalysis/src/file"
	"fmt"
	"os"
)

func main() {
	fmt.Println("Entropy Analysis")

	title, error := os.Open("title.txt")
	if error != nil { panic(fmt.Sprintf("Error: %s", error)) }

	letter := make([]byte, 1)

	for {
		// Reading in the next letter
		number, _ := title.Read(letter)
		// If no additional letter was read, stop the reading of the file
		if number == 0 { break }

		fmt.Print(string(letter))
	}

	title.Close()

	// Crating an array of 6 files
	files := [6]file.File{}

	// Doing analysis on all 6 source files
	for fileNumber := 0; fileNumber < 6; fileNumber++ {
		fileName := fmt.Sprintf("source_%d.txt", fileNumber + 1)

		// Giving the pointer to the files array
		files[fileNumber].Open(fileName)

		files[fileNumber].Analyse()

		files[fileNumber].PrintResults()
	}
}
