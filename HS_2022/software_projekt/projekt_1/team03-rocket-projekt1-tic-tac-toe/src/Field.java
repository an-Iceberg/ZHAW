/**
 * A class representing a single field on the playing field.
 */
public class Field {
    public static final String MARK_EMPTY = " ";
    public static final String MARK_PLAYER1 = "X";
    public static final String MARK_PLAYER2 = "O";
    private String mark = MARK_EMPTY;

    /**
     * Get the Mark for this field.
     *
     * @return mark.
     */
    public String getMark() {
        return this.mark;
    }

    /**
     * Mark this field.
     *
     * @param mark " ", "X" or "O".
     */
    public void setMark(String mark) {
        if (!this.isValidMark(mark))
            mark = MARK_EMPTY;

        this.mark = mark;
    }

    /**
     * Check if field is empty.
     *
     * @return true, if field is empty.
     */
    public boolean isEmpty() {
        return this.mark.equals(MARK_EMPTY);
    }

    /**
     * Check if mark is valid.
     *
     * @param mark " ", "X" or "O".
     * @return true, if mark is one of the above Strings.
     */
    private boolean isValidMark(String mark) {
        return (mark.equals(MARK_EMPTY) || mark.equals(MARK_PLAYER1) || mark.equals(MARK_PLAYER2));
    }
}
