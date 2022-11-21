/**
 * A class to represent Messages.
 */
public class Message {
    private String key;
    private String value;

    public Message(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Get the key of this message.
     * @return The key.
     */
    public String getKey() {
        return key;
    }

    /**
     * Get the content of this message.
     * @return The message.
     */
    public String getValue() {
        return value;
    }
}
