public class UC6 {
    public static String[] getO() {
        return new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
    }

    public static String[] getP() {
        return new String[]{
            "****** ",
            "**   **",
            "**   **",
            "*****  ",
            "**     ",
            "**     ",
            "**     "
        };
    }

    public static String[] getS() {
        return new String[]{
            "   *****",
            " **     ",
            "**      ",
            "  ***** ",
            "      **",
            " **   **",
            "  ***** "
        };
    }

    public static void main(String[] args) {
        String[] O1 = getO();
        String[] O2 = getO();
        String[] P = getP();
        String[] S = getS();

        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", O1[i], O2[i], P[i], S[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
