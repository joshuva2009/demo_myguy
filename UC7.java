public class UC7 {
    static class CharacterPattern {
        char character;
        String[] pattern;
        
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
            "****** ",
            "**   **",
            "**   **",
            "*****  ",
            "**     ",
            "**     ",
            "**     "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
            "   *****",
            " **     ",
            "**      ",
            "  ***** ",
            "      **",
            " **   **",
            "  ***** "
        });

        CharacterPattern[] word = {oPattern, oPattern, pPattern, sPattern};
        
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            String[] parts = new String[word.length];
            for (int p = 0; p < word.length; p++) {
                parts[p] = word[p].getPattern()[i];
            }
            banner[i] = String.join(" ", parts);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
