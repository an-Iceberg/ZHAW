import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * A class to test the index feature of the editor.
 *
 * @author Team Rocket
 * @version 0.1.0
 */
class IndexTest {

    /**
     * Test-Case 1: Check if the basic function of buildIndex works as intended.
     * Positive test
     * Initial state: Newly constructed Text class.
     * Input: Five different Strings containing three words each.
     * Actions: Add Strings to "paragraphs", call buildIndex, compare output with testMap.
     * Expected output: A Map containing the following key as a String "Klaus", "Schmaus", "Graus" and their respective values as a Set (1, 2, 3), (2, 3, 4) and (3, 4, 5).
     */
    @Test
    void buildIndexTest() {
        Text text = new Text();
        Map<String, Set<Integer>> testMap = new HashMap<>();
        testMap.put("Klaus", Set.of(1, 2, 3));
        testMap.put("Schmaus", Set.of(2, 3, 4));
        testMap.put("Graus", Set.of(3, 4, 5));

        text.getParagraphs().add("Haus Maus Klaus");
        text.getParagraphs().add("Maus Klaus Schmaus");
        text.getParagraphs().add("Klaus Schmaus Graus");
        text.getParagraphs().add("Schmaus Graus Zaus");
        text.getParagraphs().add("Graus Zaus Laus");

        assertEquals(testMap, text.buildIndex());
    }

    /**
     * Test-Case 2: Check if buildIndex produces output with only lower case words.
     * Negative test
     * Initial state: Newly constructed Text class.
     * Input: Five different Strings containing three lower case words each.
     * Actions: Add Strings to "paragraphs", call buildIndex, compare output with testMap.
     * Expected output: An empty Map.
     */
    @Test
    void buildIndexTestLowerCaseWords() {
        Text text = new Text();
        Map<String, Set<Integer>> testMap = new HashMap<>();
        testMap.put("Klaus", Set.of(1, 2, 3));
        testMap.put("Schmaus", Set.of(2, 3, 4));
        testMap.put("Graus", Set.of(3, 4, 5));

        text.getParagraphs().add("haus maus klaus");
        text.getParagraphs().add("maus klaus schmaus");
        text.getParagraphs().add("klaus schmaus graus");
        text.getParagraphs().add("schmaus graus zaus");
        text.getParagraphs().add("graus zaus laus");

        Map<String, Set<Integer>> index = text.buildIndex();
        assertEquals(0, index.size());
        assertNotEquals(testMap, index);
    }

    /**
     * Test-Case 3: Check if buildIndex produces output if no word occurs more than two times.
     * Positive test
     * Initial state: Newly constructed Text class.
     * Input: Five different Strings containing three upper case words each.
     * Actions: Add Strings to "paragraphs", call buildIndex, compare output with testMap.
     * Expected output: An empty Map
     */
    @Test
    void buildIndexTestLessThanThreeWords() {
        Text text = new Text();
        Map<String, Set<Integer>> testMap = new HashMap<>();

        text.getParagraphs().add("Haus Maus Klaus");
        text.getParagraphs().add("Maus Klaus Schmaus");
        text.getParagraphs().add("Samiklaus Schmaus Graus");
        text.getParagraphs().add("Heidenschmaus Graus Zaus");
        text.getParagraphs().add("Grausam Zaus Laus");

        assertEquals(testMap, text.buildIndex());
    }

    /**
     * Test-Case 4: Check if buildIndex correctly adds a word to its directory when occurring three times or more in the same paragraph.
     * Positive test
     * Initial state: Newly constructed Text class.
     * Input: Five different Strings. The first String contains "Haus" five times.
     * Actions: Add Strings to "paragraphs", call buildIndex, compare output with testMap.
     * Expected output: Expected output: A Map containing the following key as a String "Haus", "Braus", "Schmaus", "Aus" and their respective values as a Set (1), (2), (1, 4) and (5).
     */
    @Test
    void buildIndexTestThreeWordsInSameParagraph() {
        Text text = new Text();
        Map<String, Set<Integer>> testMap = new HashMap<>();
        testMap.put("Haus", Set.of(1));
        testMap.put("Braus", Set.of(2));
        testMap.put("Schmaus", Set.of(1, 4));
        testMap.put("Aus", Set.of(5));

        text.getParagraphs().add("Haus Schmaus Haus Schmaus Haus Haus Haus");
        text.getParagraphs().add("Klaus Braus Saus Braus Gauss Braus");
        text.getParagraphs().add("Klaus Saus Graus");
        text.getParagraphs().add("Schmaus Graus Zaus");
        text.getParagraphs().add("Aus Aus Aus");

        assertEquals(testMap, text.buildIndex());
    }

    /**
     * Test-Case 5: Check if buildIndex adds symbols.
     * Positive test
     * Initial state: Newly constructed Text class.
     * Input: Four Strings containing only symbols and spaces.
     * Actions: Add Strings to "paragraphs", call buildIndex, compare output with testMap (empty).
     * Expected output: An empty Map.
     */
    @Test
    void buildIndexTestWithOnlySymbols() {
        Text text = new Text();
        Map<String, Set<Integer>> testMap = new HashMap<>();

        text.getParagraphs().add("0 1 2 3 4 5 6 7 8 9");
        text.getParagraphs().add(". , : ; - ! ? ’ ( ) ");
        text.getParagraphs().add("\" % @ + * [ ]");
        text.getParagraphs().add("{ } / \\ & # $");

        assertEquals(testMap, text.buildIndex());
    }
}
