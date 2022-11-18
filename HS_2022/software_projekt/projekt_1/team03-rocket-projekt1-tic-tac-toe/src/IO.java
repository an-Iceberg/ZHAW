import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A class to read player input and to make the game visible / give feedback to the players.
 */

public class IO {
    private List<Locale> locales = this.buildLocales();
    private Locale selectedLocale = this.locales.get(1);

    /**
     * Greets the player with a fancy title.
     */
    public void greet() {
        System.out.println("""
              _______ _        _______           _______
             |__   __(_)      |__   __|         |__   __|
                | |   _  ___     | | __ _  ___     | | ___   ___
                | |  | |/ __|    | |/ _` |/ __|    | |/ _ \\ / _ \\
                | |  | | (__     | | (_| | (__     | | (_) |  __/
                |_|  |_|\\___|    |_|\\__,_|\\___|    |_|\\___/ \\___|
            """);
    }

    /**
     * Prints winning player.
     *
     * @param mark that wins the game.
     */
    public void playerWon(String mark) {
        System.out.printf(
            "%s %s %s\n",
            this.selectedLocale.getMessage("game.playerCall"),
            mark,
            this.selectedLocale.getMessage("game.playerWon")
        );
    }

    /**
     * Print message that game is a draw.
     */
    public void draw() {
        System.out.println(this.selectedLocale.getMessage("game.draw"));
    }

    /**
     * Ask players to choose a language.
     */
    public void askForLanguageChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.selectedLocale.getMessage("locale.select"));
        for (int i = 0; i < this.locales.size(); i++)
            System.out.println((i + 1) + ". " + this.locales.get(i).getName());

        if (scanner.hasNextInt()) {
            int index = scanner.nextInt(10);
            if (index > 0 && index <= this.locales.size()) {
                this.selectedLocale = this.locales.get(--index);
                System.out.println(this.selectedLocale.getMessage("locale.confirmation"));
                return;
            }
        } else if (scanner.hasNextLine()) {
            String line = scanner.nextLine().toLowerCase().trim();
            for (Locale locale : this.locales) {
                if (locale.getName().toLowerCase().equals(line)) {
                    this.selectedLocale = locale;
                    System.out.println(this.selectedLocale.getMessage("locale.confirmation"));
                    return;
                }
            }
        }

        System.out.println(this.selectedLocale.getMessage("interaction.error"));
        this.askForLanguageChange();
    }

    /**
     * Ask the player to pick a free field.
     *
     * @param currentPlayer The player whose turn it is.
     * @param freeFields    All free fields.
     * @return The index of the chosen field.
     */
    public int askForPlayingField(String currentPlayer, List<Integer> freeFields) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s %s: %s\n", this.selectedLocale.getMessage("game.playerCall"), currentPlayer, this.selectedLocale.getMessage("game.pickField"));
        System.out.print(freeFields.toString() + ": ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (freeFields.contains(number))
                return number;
        }

        System.out.println(this.selectedLocale.getMessage("interaction.error"));
        return this.askForPlayingField(currentPlayer, freeFields);
    }

    /**
     * Ask players if they want to play another match.
     *
     * @return true, if players want to play again.
     */
    public boolean continueAnotherMatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.selectedLocale.getMessage("game.playAgain"));

        switch (scanner.nextLine().toLowerCase().trim()) {
            case "y", "yes":
                return true;
            case "n", "no":
                return false;
            default:
                System.out.println(this.selectedLocale.getMessage("interaction.error"));
                return this.continueAnotherMatch();
        }
    }

    /**
     * Build list of preset text in german and english.
     *
     * @return An ArrayList of locales.
     */
    private List<Locale> buildLocales() {
        List<Locale> locales = new ArrayList<>();

        Locale de_CH = new Locale("Deutsch");
        de_CH.addMessage(new Message("game.welcome", "Willkommen bei Tic Tac Toe!"));
        de_CH.addMessage(new Message("game.pickField", "Wählen Sie bitte ein Feld "));
        de_CH.addMessage(new Message("game.playAgain", "Möchten Sie noch ein Spiel spielen? (y/n): "));
        de_CH.addMessage(new Message("game.playerCall", "Spieler"));
        de_CH.addMessage(new Message("game.playerWon", "hat gewonnen!"));
        de_CH.addMessage(new Message("game.draw", "Unentschieden."));
        de_CH.addMessage(new Message("interaction.error", "Ungültige Eingabe, bitte versuchen Sie es nochmal."));
        de_CH.addMessage(new Message("locale.available", "Dieses Spiel steht in den folgenden Sprachen zur Verfügung: "));
        de_CH.addMessage(new Message("locale.select", "Bitte geben Sie die Zahl oder Name Ihrer gewünschten Sprache ein: "));
        de_CH.addMessage(new Message("locale.confirmation", "Sie haben Deutsch gewählt."));
        locales.add(de_CH);

        Locale en_US = new Locale("English");
        en_US.addMessage(new Message("game.welcome", "Welcome to Tic Tac Toe!"));
        en_US.addMessage(new Message("game.pickField", "Please pick a field "));
        en_US.addMessage(new Message("game.playAgain", "Do you want to play another game? (y/n): "));
        en_US.addMessage(new Message("game.playerCall", "Player"));
        en_US.addMessage(new Message("game.playerWon", "has won!"));
        en_US.addMessage(new Message("game.draw", "It is a draw."));
        en_US.addMessage(new Message("interaction.error", "Invalid input, please try again."));
        en_US.addMessage(new Message("locale.available", "This game is available in the following languages: "));
        en_US.addMessage(new Message("locale.select", "Please enter the number or name of your desired language: "));
        en_US.addMessage(new Message("locale.confirmation", "You have selected English."));
        locales.add(en_US);

        return locales;
    }
}
