import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Manages the paragraphs in the text.
 *
 * @author Team Rocket
 * @version 0.1.0
 */
public class Text {
    public static final int PARAGRAPH_INDEX_OFFSET = 1;
    private final List<String> paragraphs = new ArrayList<>();

    public List<String> getParagraphs() {
        return this.paragraphs;
    }

    /**
     * Adds a new paragraph at the specified index.
     *
     * @param index The index that defines the order of the paragraphs
     * @param text  The actual paragraph
     */
    public void add(int index, String text) {
        if (index >= 0 && index <= this.paragraphs.size()) this.paragraphs.add(index, this.filterInvalidChars(text));
    }

    /**
     * Deletes the paragraph at the specified index.
     *
     * @param index The paragraph to be deleted
     */
    public void delete(int index) {
        if (index >= 0 && index <= this.paragraphs.size() && !this.paragraphs.isEmpty()) this.paragraphs.remove(index);
    }

    /**
     * Replaces a text sequence in the specified paragraph.
     *
     * @param index   The index of the paragraph to be edited
     * @param search  The text sequence to be replaced
     * @param replace The text sequence to replace the old one
     */
    public void replace(int index, String search, String replace) {
        if (index >= 0 && index <= this.paragraphs.size() && !this.paragraphs.isEmpty())
            this.paragraphs.set(index, this.paragraphs.get(index).replace(search, replace));
    }

    /**
     * Creates an index by mapping Strings occurring three times or more to their respective paragraph numbers.
     *
     * @return An index as a map containing nouns as key (String) with the paragraph numbers they occur in as value (Set of Integers)
     */
    public Map<String, Set<Integer>> buildIndex() {
        Map<String, List<Integer>> dictionary = this.createDictionary();
        List<String> nouns = new ArrayList<>(dictionary.keySet());
        Collections.sort(nouns);

        Map<String, Set<Integer>> index = new HashMap<>();
        for (String noun : nouns) {
            if (dictionary.get(noun).size() >= 3) {
                index.put(noun, new HashSet<>(dictionary.get(noun)));
            }
        }
        return index;
    }

    /**
     * Replaces all illegal characters/symbols with an empty String.
     *
     * @param text String to be filtered
     * @return A new String containing only the legal characters
     */
    private String filterInvalidChars(String text) {
        // Regex removes all invalid characters from text that are not in a-z, 0-9, umlauts or the following characters: .,:;-!?’()"%@+*[]{}/\&#$
        return text.replaceAll("[^a-zA-Z0-9äöüÄÖÜ\\s.,:;\\-!?’()\"%@+*\\[\\]{}/\\\\&#$]", "");
    }

    /**
     * Creates a map containing every unique noun and ALL respective paragraph numbers.
     *
     * @return A Map containing nouns as key (String) with ALL respective paragraph numbers as value (List of Integers)
     */
    private Map<String, List<Integer>> createDictionary() {
        Map<String, List<Integer>> dictionary = new HashMap<>(); // Word: [Paragraph Indexes]

        for (int i = 0; i < this.paragraphs.size(); i++) {
            for (String noun : this.getNouns(this.paragraphs.get(i))) {
                dictionary.putIfAbsent(noun, new ArrayList<>());
                dictionary.get(noun).add(i + Text.PARAGRAPH_INDEX_OFFSET);
            }
        }
        return dictionary;
    }

    /**
     * Returns a list of all nouns in the given text.
     *
     * @param text The text to search for nouns
     * @return An ArrayList of all nouns in the given text
     */
    private List<String> getNouns(String text) {
        List<String> nouns = new ArrayList<>();
        Matcher m = Pattern.compile("\\b[A-ZÄÖÜ][a-zäöü]+\\b").matcher(text); // Regex matches (swiss-german) words that start with a capital letter

        while (m.find()) nouns.add(m.group());

        return nouns;
    }
}
