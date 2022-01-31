public class Main {
    public static void main(String[] args) {
        String[][] x = new String[7][7];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == 0) {
                    if (j == 0 || j == x[i].length - 1) {
                        x[i][j] = "X";
                    }
                } else if (x[i - 1][j].equals("X")) {
                    if (j < x[i].length / 2) {
                        x[i][j + 1] = "X";
                    }
                } else if (j != 6 && x[i - 1][j + 1].equals("X")) {
                    if (j >= x[i].length / 2) {
                        x[i][j] = "X";
                    }
                }
                if (x[i][j] == null || !x[i][j].equals("X")) {
                    x[i][j] = "0";
                }
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }

    }
}
