public class OOPSBannerApp {

    // Inner Static Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPattern getCharacterPattern(char ch) {

        switch (ch) {

            case 'O':
                return new CharacterPattern('O', new String[]{
                        " ******** ",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        "*        *",
                        " ******** "
                });

            case 'P':
                return new CharacterPattern('P', new String[]{
                        " ******** ",
                        "*        *",
                        "*        *",
                        " ******** ",
                        "*         ",
                        "*         ",
                        "*         "
                });

            case 'S':
                return new CharacterPattern('S', new String[]{
                        " ******** ",
                        "*         ",
                        "*         ",
                        " ******** ",
                        "         *",
                        "         *",
                        " ******** "
                });

            default:
                return null;
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        CharacterPattern[] patterns = new CharacterPattern[word.length()];

        for (int i = 0; i < word.length(); i++) {
            patterns[i] = getCharacterPattern(word.charAt(i));
        }

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}