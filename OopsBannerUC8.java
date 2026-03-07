import java.util.HashMap;
import java.util.Map;

public class OopsBannerUC8 {

    private static Map<Character, String[]> buildCharacterPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        // 7-line pattern for 'O'
        String[] oPattern = {
                "    ***     ",
                "  **    **  ",
                "**       ** ",
                "**       ** ",
                "**       ** ",
                "**       ** ",
                "**       ** ",
                "  **    **  ",
                "    ***     " 
        };

        // 7-line pattern for 'P'
        String[] pPattern = {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };

        // 7-line pattern for 'S'
        String[] sPattern = {
                "   *****",
                " **    ",
               "**    ",
                " **    ",
                "   *** ",
                "      **",
                "       **",
                "      **",
                " ***** "
        };

        map.put('O', oPattern);
        map.put('P', pPattern);
        map.put('S', sPattern);

        return map;
    }

    private static void printBannerWord(String word, Map<Character, String[]> patternMap) {
        if (word == null || word.isEmpty()) {
            return;
        }

        // assume all patterns have same height (7)
        int height = 9;

        for (int row = 0; row < height; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toUpperCase(word.charAt(i));
                String[] pattern = patternMap.get(ch);

                if (pattern == null) {
                    // fallback: blank space pattern for unknown characters
                    lineBuilder.append("     ");
                } else {
                    lineBuilder.append(pattern[row]);
                }

                lineBuilder.append("  "); // spacing between letters
            }

            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> characterPatternMap = buildCharacterPatternMap();
        String word = "OOPS";
        printBannerWord(word, characterPatternMap);
    }
}
