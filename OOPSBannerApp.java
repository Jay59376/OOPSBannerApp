class OOPSBannerApp {

    public static void main(String[] args) {

        String gap = "   ";

        String[] banner = {

            String.join(gap, " ***** ", " ***** ", " ******", " ***** "),
            String.join(gap, "*     *", "*     *", "*     *", "*     *"),
            String.join(gap, "*     *", "*     *", "*     *", "*      "),
            String.join(gap, "*     *", "*     *", "****** ", " ***** "),
            String.join(gap, "*     *", "*     *", "*      ", "      *"),
            String.join(gap, "*     *", "*     *", "*      ", "*     *"),
            String.join(gap, " ***** ", " ***** ", "*      ", " ***** ")

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}

