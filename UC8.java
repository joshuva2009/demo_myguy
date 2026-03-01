import java.util.HashMap;
import java.util.Map;

public class UC8 {
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = new HashMap<>();
        
        patternMap.put('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        patternMap.put('P', new String[]{
            "****** ",
            "**   **",
            "**   **",
            "*****  ",
            "**     ",
            "**     ",
            "**     "
        });

        patternMap.put('S', new String[]{
            "   *****",
            " **     ",
            "**      ",
            "  ***** ",
            "      **",
            " **   **",
            "  ***** "
        });

        String target = "OOPS";
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            String[] parts = new String[target.length()];
            for (int c = 0; c < target.length(); c++) {
                parts[c] = patternMap.get(target.charAt(c))[i];
            }
            banner[i] = String.join(" ", parts);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
