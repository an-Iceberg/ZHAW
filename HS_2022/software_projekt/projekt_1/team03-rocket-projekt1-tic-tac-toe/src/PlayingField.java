import java.util.ArrayList;
import java.util.List;

/**
 * A class to represent the playing field of the game.
 * The state of each field is described by 0, 1, 2 or " ", "O", "X" respectively.
 * Each field is represented by an Index:
 *  ╔═══╦═══╦═══╗
 *  ║ 1 ║ 2 ║ 3 ║
 *  ╠═══╬═══╬═══╣
 *  ║ 4 ║ 5 ║ 6 ║
 *  ╠═══╬═══╬═══╣
 *  ║ 7 ║ 8 ║ 9 ║
 *  ╚═══╩═══╩═══╝
 */

public class PlayingField {
    private List<Field> fields = new ArrayList<>();

    /**
     * Creates a playing field with 9 empty cells.
     */
    public PlayingField() {
        for (int i = 0; i <= 8; i++) {
            this.fields.add(new Field());
        }
    }

    /**
     * @param index Takes an integer between 1 and 9.
     * @return Returns the field. Returns null if the input is invalid.
     */
    public Field getField(int index) {
        if (index < 1 || index > 9) {
            return null;
        }

        return this.fields.get(index - 1);
    }

    /**
     * @return Returns an ArrayList containing all empty fields.
     */
    public List<Integer> getAllFreeFields() {
        List<Integer> freeFields = new ArrayList<>();

        // Checks for empty fields
        for (int i = 0; i < this.fields.size(); i++) {
            // The index of an empty field is added to the return value
            if (this.fields.get(i).isEmpty()) {
                freeFields.add(i + 1);
            }
        }

        return freeFields;
    }

    /**
     * Clear all fields.
     */
    public void reset() {
        for (Field field : fields) {
            field.setMark(Field.MARK_EMPTY);
        }
    }

    /**
     * Prints the playing field with the field contents to the console
     */
    public void print() {
        System.out.println("╔═══╦═══╦═══╗");
        System.out.printf("║ %s ║ %s ║ %s ║\n", this.printField(1), this.printField(2), this.printField(3));
        System.out.println("╠═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║\n", this.printField(4), this.printField(5), this.printField(6));
        System.out.println("╠═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║\n", this.printField(7), this.printField(8), this.printField(9));
        System.out.println("╚═══╩═══╩═══╝");
    }

    /**
     * Returns the mark of the field or the index if the field has no mark set.
     */
    private String printField(int index) {
        String field = this.fields.get(index - 1).getMark();

        if (field.equals(Field.MARK_EMPTY)) {
            return Integer.toString(index);
        }

        return field;
    }
}
