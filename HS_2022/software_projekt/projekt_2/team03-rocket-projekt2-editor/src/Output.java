import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Handles all the output of paragraphs.
 *
 * @author Team Rocket
 * @version 0.1.0
 */
public class Output {
    private int columnWidth = 0;

    public void setColumnWidth(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    /**
     * Prints an index directory containing the words that - across all paragraphs - occur three times or more.
     * Multiple occurrences of the same noun in the same paragraph are counted as one.
     * It has the following format:
     * "Word 1:" "Paragraph X", "Paragraph Y", ...
     * "Word 2:" "Paragraph Y, "Paragraph Z", ...
     * ...
     *
     * @param index The index to be printed
     */
    public void printIndex(Map<String, Set<Integer>> index) {
        for (Map.Entry<String, Set<Integer>> entry : index.entrySet()) {
            System.out.printf("%15s\t\t%s\n", entry.getKey(), entry.getValue().toString().replaceAll("[\\[\\]\\s]", "")); // Regex removes brackets and spaces
        }
    }

    /**
     * Prints the text according to the format specified.
     *
     * @param paragraphs The ArrayList containing the text to print
     */
    public void print(List<String> paragraphs) {
        if (this.columnWidth == 0) this.printRaw(paragraphs); // Prints the text in the RAW format
        else if (this.columnWidth > 0) this.printFix(paragraphs); // Prints the text in the FIX format
        else {
            System.err.println("Die Spaltenbreite kann kein negativer Wert sein.");
            System.exit(-1);
        }
    }

    /**
     * Prints every paragraph in the format "<number>: <text>".
     *
     * @param paragraphs The ArrayList containing the text to print
     */
    private void printRaw(List<String> paragraphs) {
        int index = 1;

        for (String paragraph : paragraphs) {
            System.out.println(index + ": " + paragraph);
            index++;
        }
    }

    /**
     * Prints every paragraph in a fixed width format (essentially left justified).
     *
     * @param paragraphs The ArrayList containing the text to print
     */
    private void printFix(List<String> paragraphs) {
        for (String paragraph : paragraphs) {
            this.printParagraph(paragraph.split(" "));
            System.out.println();
        }
    }

    /**
     * Prints one paragraph to the console, respecting the set column width.
     *
     * @param words An array of Strings containing all the words that need to be printed
     */
    private void printParagraph(String[] words) {
        int characterCount = 0;

        // Prints each word to the console while keeping track of how many characters were printed
        for (String word : words) {
            if (word.length() > this.columnWidth) { // If a word is longer than the column width, it is being dealt with here
                if (characterCount != 0 && characterCount < this.columnWidth) System.out.println();
                characterCount = this.printLongWord(word);
                continue;
            }

            // After this point in the loop, all words are guaranteed to be smaller than the column width
            characterCount += word.length();
            characterCount = this.printFittingWord(characterCount, word);
        }
    }

    /**
     * Prints a word into the console depending on how long it is and if it still fits into the line.
     *
     * @param characterCount The counter variable from the external loop
     * @param word           The word to be printed
     * @return The character counter after the word has been printed
     */
    private int printFittingWord(int characterCount, String word) {
        if (characterCount < this.columnWidth) // The word fits into the line with space to spare
            System.out.print(word);
        else if (characterCount == this.columnWidth) { // The word fits into the line without any space to spare
            System.out.print(word + "\n");
            characterCount = 0;
        } else { // The word no longer fits into the line, starting printing on the next line
            System.out.print("\n" + word);
            characterCount = word.length();
        }

        // Printing a space after a word but only if there is space for it
        if (characterCount != 0 && characterCount < this.columnWidth) { // The check for not 0 prevents printing of spaces at the very beginning of the line
            System.out.print(" ");
            characterCount++;
        }

        return characterCount;
    }

    /**
     * Prints a word that is longer than the set width over multiple lines.
     *
     * @param word The long word in question
     * @return The number of characters printed on the last line that the word was printed on
     */
    private int printLongWord(String word) {
        int characterCount = word.length() % this.columnWidth; // The amount of characters on the last line
        int fullLinesAmount = word.length() / this.columnWidth; // The amount of lines the word will take up without the last line

        // Printing all the lines that take up a whole line
        for (int i = 0; i < fullLinesAmount; i++)
            System.out.println(word.substring(i * this.columnWidth, (i + 1) * this.columnWidth));

        // Printing the last line depending on characterCount
        String line = word.substring(word.length() - characterCount);
        if (characterCount != 0 && characterCount < this.columnWidth) {
            System.out.print(line + " ");
            characterCount++;
        } else if (characterCount == this.columnWidth) System.out.println(line);

        return characterCount;
    }
}
