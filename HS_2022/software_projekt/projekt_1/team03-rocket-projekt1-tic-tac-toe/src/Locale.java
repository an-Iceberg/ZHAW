import java.util.ArrayList;
import java.util.List;

/**
 * A class to access and store messages displayed to the players.
 */
public class Locale {
    private String name;
    private List<Message> messages = new ArrayList<>();

    public Locale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Add a message to the list.
     * @param message Message to add
     */
    public void addMessage(Message message) {
        this.messages.add(message);
    }

    /**
     * Get a specific message from the list.
     * @param key To access the message.
     * @return The message.
     */
    public String getMessage(String key) {
        for (Message message : messages) {
            if (message.getKey().equals(key)) {
                return message.getValue();
            }
        }

        return key;
    }
}
