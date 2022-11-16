package main

import (
	"bufio"
	"entrpyAnalysis/src/file"
	"fmt"
	"os"
)

func main() {
	printTitle()

	// Crating an array of 6 files
	files := [6]file.File{}

	// Doing analysis on all 6 source files
	for fileNumber := 0; fileNumber < 6; fileNumber++ {
		fileName := fmt.Sprintf("source_%d.txt", fileNumber + 1)

		// Giving the pointer to the files array
		files[fileNumber].Open(fileName)

		files[fileNumber].Read()

		files[fileNumber].Analyse()

		files[fileNumber].PrintResults()
	}
}

func printTitle() {
	// Opens file and handles error
	title, error := os.Open("title.txt")
	if error != nil { panic(fmt.Sprintf("Error: %s", error)) }
	// Closes file
	defer title.Close()

	// File scanner
	titleScanner := bufio.NewScanner(title)
	// Splits file into lines
	titleScanner.Split(bufio.ScanLines)

	// Prints each line to the console
	for titleScanner.Scan() {
		fmt.Println(titleScanner.Text())
	}
}
