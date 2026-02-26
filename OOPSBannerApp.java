public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a given character
     */
    public static String[] getCharacterPattern(CharacterPattern[] patterns, char ch) {
        for (CharacterPattern cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC7: Inner Class Implementation\n");

        // Define patterns
        CharacterPattern[] patterns = {
                new CharacterPattern('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),
                new CharacterPattern('P', new String[]{
                        "****** ",
                        "*     *",
                        "*     *",
                        "****** ",
                        "*      ",
                        "*      ",
                        "*      "
                }),
                new CharacterPattern('S', new String[]{
                        " ***** ",
                        "*     *",
                        "*      ",
                        " ***** ",
                        "      *",
                        "*     *",
                        " ***** "
                })
        };

        String word = "OOPS";

        // Render banner row by row
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] pattern = getCharacterPattern(patterns, word.charAt(i));
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}