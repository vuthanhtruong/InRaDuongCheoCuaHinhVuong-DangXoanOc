package truongne;

import java.util.Scanner;

public class truongday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First part
        System.out.println("Moi ban nhap canh hinh vuong");
        int n = scanner.nextInt();
        int[] M = new int[n * n];
        int b = 1;
        int c = 0;
        int sum = 0;

        // Fill array with odd numbers
        for (int i = 0; i < n * n; i++) {
            M[i] = b;
            b += 2;
        }

        // Print the array
        for (int i = 0; i < n * n; i++) {
            System.out.print(M[i] + " ");
        }
        System.out.println();

        // Calculate the sum of specific elements
        for (int i = n * n - 1; i >= n - 1; i -= c) {
            System.out.print(M[i] + " ");
            sum += M[i];
            c += 2;
        }
        System.out.println("Gia tri cua sum la: " + sum);
        System.out.println("______________________________________________________________________");

        // Second part
        System.out.println("Moi ban nhap canh hinh vuong");
        n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int h1 = 0, h2 = n - 1;
        int c1 = 0, c2 = n - 1;
        int count = 1;

        // Fill matrix in a spiral order with odd numbers
        while (h1 <= h2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                matrix[h1][i] = count;
                count += 2;
            }
            h1++;
            for (int j = h1; j <= h2; j++) {
                matrix[j][c2] = count;
                count += 2;
            }
            c2--;
            for (int i = c2; i >= c1; i--) {
                matrix[h2][i] = count;
                count += 2;
            }
            h2--;
            for (int j = h2; j >= h1; j--) {
                matrix[j][c1] = count;
                count += 2;
            }
            c1++;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("____________");

        // Print the main diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + "   ");
                }
            }
        }
        System.out.println();
        System.out.println("____________");

        // Print the secondary diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - j == i + 1) {
                    System.out.print(matrix[i][j] + "   ");
                }
            }
        }
    }
}
