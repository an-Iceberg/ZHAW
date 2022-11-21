import java.util.Arrays;
import java.util.Scanner;

/**
 * Handles all user interaction - prompts for input and parses it.
 *
 * @author Team Rocket
 * @version 0.1.0
 */
class Interaction {
    private final Scanner scanner = new Scanner(System.in);
    private String[] lastCommand = new String[0];

    /**
     * Prints the greeting to the user.
     */
    public void printGreeting() {
        System.out.println("Willkommen zum Texteditor!");
        System.out.println();
    }

    /**
     * Prompts the user for a string.
     *
     * @param prompt The message to print before the prompt
     */
    public String promptString(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();
    }

    /**
     * Prompts the user for a command, parses it and saves it for further usage.
     */
    public void promptCommand() {
        this.lastCommand = this.promptString("> ").split(" ");
    }

    /**
     * Gets the next string in the params of the last prompted command.
     * This will return the value and remove it from the last command array.
     *
     * @return The next string from the last prompted command
     */
    public String getNextString() {
        if (this.lastCommand.length == 0) return null;

        String result = this.lastCommand[0];
        this.lastCommand = Arrays.copyOfRange(this.lastCommand, 1, this.lastCommand.length);

        return result;
    }

    /**
     * Parses the next number in the params of the last prompted command.
     * This will return the value and remove it from the last command array.
     *
     * @return The parsed number, -1 if the String is not a positive number or null if the last command is empty
     */
    public Integer parseNextInt() {
        if (this.lastCommand.length == 0) return null;

        int result = this.parsePositiveInt(this.lastCommand[0]);
        if (result < 0) return -1;

        this.lastCommand = Arrays.copyOfRange(this.lastCommand, 1, this.lastCommand.length);
        return result;
    }

    /**
     * Parses a paragraphs index from the last command.
     * This will return the value and remove it from the last command array.
     *
     * @param paragraphsSize The size of the paragraphs ArrayList
     * @return The parsed paragraph index, the last paragraph index if the provided index is invalid or null if the last command is empty
     */
    public Integer parseNextIndex(int paragraphsSize) {
        if (this.lastCommand.length == 0) return null;

        int result = this.parsePositiveInt(this.lastCommand[0]) - Text.PARAGRAPH_INDEX_OFFSET;
        if (result < 0 || result > paragraphsSize) {
            System.err.println("Kein gültiger Index angegeben.");
            return -1;
        }

        this.lastCommand = Arrays.copyOfRange(this.lastCommand, 1, this.lastCommand.length);
        return result;
    }

    /**
     * Semi-safe way to parse a positive number without throwing an exception when entering a non-numeric string.
     *
     * @param string The string to parse
     * @return The parsed number, -1 if the String is not a positive number
     */
    private int parsePositiveInt(String string) {
        long number = 0;

        for (int i = 0; i < string.length(); i++) {
            int asciiValue = string.charAt(i) - '0';
            if (asciiValue < 0 || asciiValue > 9) return -1;

            number = (10 * number) + asciiValue;
        }

        return number > Integer.MAX_VALUE ? -1 : (int) number;
    }
}
