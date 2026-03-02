public class OOPSBannerAppuc6 {

    public static String[] getO() {
        return new String[]{" *** ", "* *", "* *", "* *", " *** "};
    }

    public static String[] getP() {
        return new String[]{"**** ", "* *", "**** ", "* ", "* "};
    }public class OOPSBannerApp {

    public static String[] getOPattern() {
        return new String[]{
                "     ***     ",
                "  **     **  ",
                " **       ** ",
                " **       ** ",
                " **       ** ",
                " **       ** ",
                " **       ** ",
                "  **     **  ",
                "     ***     "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ******    ",
                " **    **  ",
                " **     ** ",
                " **    **  ",
                " ******    ",
                " **        ",
                " **        ",
                " **        ",
                " **        "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "    *****    ",
                "  **         ",
                " **          ",
                "  **         ",
                "    ***      ",
                "       **    ",
                "        **  ",
                "       **    ",
                "  *****      ",
                "          "
        };
    }

    public static void main(String[] args) {
        String[][] banner = { getOPattern(), getOPattern(), getPPattern(), getSPattern() };
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  ");
            }
            System.out.println();
        }
    }
}

    public static String[] getS() {
        return new String[]{" ****", "* ", " *** ", "    *", "**** "};
    }

    public static void main(String[] args) {
        String[][] banner = { getO(), getO(), getP(), getS() };

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  ");
            }
            System.out.println();
        }
    }
}