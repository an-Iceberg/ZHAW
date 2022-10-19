package characterCount

import "math"

type Character struct {
	Character          string
	Count              int
	Probability        float64
	InformationContent float64
}

func (letter *Character) IncrementCount() {
	letter.Count++
}

func (letter *Character) Analyse(totalCharacters int) {
	letter.Probability = float64(letter.Count) / float64(totalCharacters)
	letter.InformationContent = math.Log2(1 / letter.Probability)
}
