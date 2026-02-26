import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Utility method to create and return character pattern map
     */
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    /**
     * Utility method to render banner
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                line.append(map.get(ch)[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC8: HashMap Implementation\n");

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner("OOPS", patternMap);
    }
}