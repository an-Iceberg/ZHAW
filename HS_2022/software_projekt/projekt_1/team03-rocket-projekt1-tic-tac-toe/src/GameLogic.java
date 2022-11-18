/**
 * A class to track the progress of the game and determine the outcome.
 */
public class GameLogic {
    private PlayingField playingField = new PlayingField();
    private IO io = new IO();
    private String currentPlayer = Field.MARK_PLAYER1;

    /**
     * Start the game. Main controlling mechanism to run the game and keep track of its internal state.
     */
    public void start() {
        this.io.greet();

        // Outer game loop for rematch and language change
        do {
            this.io.askForLanguageChange();
            this.playingField.reset();

            // ### Main Game Loop ###
            while (true) {
                this.playingField.print();

                // Getting player field selection
                int playerSelection = io.askForPlayingField(this.currentPlayer, this.playingField.getAllFreeFields());
                System.out.println();

                // Setting specified field to player's mark
                this.playingField.getField(playerSelection).setMark(this.currentPlayer);

                // Some player won
                if (!checkWinner().equals(Field.MARK_EMPTY)) {
                    this.io.playerWon(this.currentPlayer);
                    this.playingField.print();
                    break;
                }
                // Draw
                else if (checkWinner().equals(Field.MARK_EMPTY) && this.playingField.getAllFreeFields().isEmpty()) {
                    this.io.draw();
                    this.playingField.print();
                    break;
                }

                // Switching the player around at the end of one's turn
                this.switchPlayer();
            }
        } while (this.io.continueAnotherMatch());
    }

    /**
     * Check, if there is a winner.
     *
     * @return X: If there is three Xs in a row. O: If there is three Os in a row.
     */
    public String checkWinner() {
        String line;

        for (int a = 0; a <= 7; a++) {
            line = "";
            line = switch (a) {
                case 0 -> this.getConstellation(1, 2, 3); // First row
                case 1 -> this.getConstellation(4, 5, 6); // Second row
                case 2 -> this.getConstellation(7, 8, 9); // Third row
                case 3 -> this.getConstellation(1, 4, 7); // First column
                case 4 -> this.getConstellation(2, 5, 8); // Second column
                case 5 -> this.getConstellation(3, 6, 9); // Third column
                case 6 -> this.getConstellation(1, 5, 9); // Top left diagonal
                case 7 -> this.getConstellation(3, 5, 7); // Top right diagonal
                default -> line;
            };

            if (line.equals(Field.MARK_PLAYER1 + Field.MARK_PLAYER1 + Field.MARK_PLAYER1)) // X wins
                return Field.MARK_PLAYER1;
            else if (line.equals(Field.MARK_PLAYER2 + Field.MARK_PLAYER2 + Field.MARK_PLAYER2)) // O wins
                return Field.MARK_PLAYER2;
        }

        return Field.MARK_EMPTY;
    }

    /**
     * @param field1 Index field 1.
     * @param field2 Index field 2.
     * @param field3 Index field 3.
     * @return Content of Field 1 - 3 as a String.
     */
    private String getConstellation(int field1, int field2, int field3) {
        return this.playingField.getField(field1).getMark() + this.playingField.getField(field2).getMark() + this.playingField.getField(field3).getMark();
    }

    /**
     * Switches the player
     */
    private void switchPlayer() {
        if (this.currentPlayer.equals(Field.MARK_PLAYER1))
            this.currentPlayer = Field.MARK_PLAYER2;
        else
            this.currentPlayer = Field.MARK_PLAYER1;
    }
}
