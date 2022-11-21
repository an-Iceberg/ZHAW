/**
 * The main class of the Editor.
 * Handles all commands and calls the appropriate methods.
 *
 * @author Team Rocket
 * @version 0.1.0
 */
class Editor {
    private final Text text = new Text();
    private final Interaction interaction = new Interaction();
    private final Output output = new Output();

    /**
     * Entrypoint for the Editor.
     * Prints the greeting to the user and starts prompting for input.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.interaction.printGreeting();

        while (true) {
            editor.interaction.promptCommand();
            editor.executeCommand();
        }
    }

    /**
     * Executes the last prompted command.
     */
    private void executeCommand() {
        switch (this.interaction.getNextString().toLowerCase()) {
            case "add" -> this.add();
            case "del" -> this.del();
            case "dummy" -> this.dummy();
            case "exit" -> this.exit();
            case "format" -> this.format();
            case "index" -> this.index();
            case "print" -> this.print();
            case "replace" -> this.replace();
            default -> System.err.println("Unbekanntes Kommando");
        }
    }

    /**
     * Handles the ADD command.
     * Adds a paragraph to the text.
     */
    private void add() {
        Integer index = this.interaction.parseNextIndex(this.text.getParagraphs().size());
        if (index != null && index == -1)
            return; // If index is invalid (-1) skip, if no index is specified, use last paragraph

        String text = this.interaction.promptString("Text: ");
        this.text.add(index == null ? this.text.getParagraphs().size() : index, text);
    }

    /**
     * Handles the DEL command.
     * Deletes a paragraph from the text.
     */
    private void del() {
        Integer index = this.interaction.parseNextIndex(this.text.getParagraphs().size());
        if (index != null && index == -1)
            return; // If index is invalid (-1) skip, if no index is specified, use last paragraph

        this.text.delete(index == null ? this.text.getParagraphs().size() - 1 : index);
    }

    /**
     * Handles the DUMMY command.
     * Adds a dummy paragraph to the text.
     */
    private void dummy() {
        Integer index = this.interaction.parseNextIndex(this.text.getParagraphs().size());
        if (index != null && index == -1)
            return; // If index is invalid (-1) skip, if no index is specified, use last paragraph

        this.text.add(index == null ? this.text.getParagraphs().size() : index, "Dies ist ein Blindtext. Mit ihm kann man sehen, ob die Funktionalität vorhanden ist.");
    }

    /**
     * Handles the EXIT command.
     * Exits the program.
     */
    private void exit() {
        System.exit(0);
    }

    /**
     * Handles the FORMAT command.
     * Sets the format type of the output.
     */
    private void format() {
        String type = this.interaction.getNextString();
        Integer width = this.interaction.parseNextInt();

        switch (type != null ? type.toLowerCase() : "") {
            case "raw" -> width = 0;
            case "fix" -> {
                if (width == null || width <= 0) {
                    System.err.println("Keine gültige Breite angegeben.");
                    return;
                }
            }
            default -> {
                System.err.println("Kein gültiger Formattyp angegeben.");
                return;
            }
        }

        this.output.setColumnWidth(width);
    }

    /**
     * Handles the INDEX command.
     * Prints the index of paragraphs.
     */
    private void index() {
        this.output.printIndex(this.text.buildIndex());
    }

    /**
     * Handles the PRINT command.
     * Prints the text in the current set format.
     */
    private void print() {
        this.output.print(this.text.getParagraphs());
    }

    /**
     * Handles the REPLACE command.
     * Replaces a part of a paragraph with another string.
     */
    private void replace() {
        Integer index = this.interaction.parseNextIndex(this.text.getParagraphs().size());
        if (index != null && index == -1)
            return; // If index is invalid (-1) skip, if no index is specified, use last paragraph

        String search = this.interaction.promptString("Zu finden: ");
        String replace = this.interaction.promptString("Ersetzen mit: ");
        this.text.replace(index == null ? this.text.getParagraphs().size() - 1 : index, search, replace);
    }
}
