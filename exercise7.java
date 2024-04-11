import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void spiralMatrix(int[][] matrix, int size, int value, int row, int col) {

        if (size == 0) {
            return;
        }
        if (size == 1) {
            matrix[row][col] = value;
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            matrix[row][col++] = value++;
        }
        for (int i = 0; i < size - 1; i++) {
            matrix[row++][col] = value++;
        }
        for (int i = 0; i < size - 1; i++) {
            matrix[row][col--] = value++;
        }
        for (int i = 0; i < size - 1; i++) {
            matrix[row--][col] = value++;
        }

        spiralMatrix(matrix, size - 2, value, row + 1, col + 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        spiralMatrix(matrix, n, 1, 0, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
