import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите размер массива: ");
            while (!sc.hasNextInt()) {
                System.out.println("Это не число! Введите положительное число:");
                sc.next();
            }
            size = sc.nextInt();
        } while (size < 0);

        String[][] x = new String[size][size];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (j == i) {
                    x[i][j] = "X";
                }
                if (j == (x[i].length - 1) - i) {
                    x[i][j] = "X";
                }
                if (x[i][j] == null) {
                    x[i][j] = " ";
                }
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }
    }
}
