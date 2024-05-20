package truongne;

import java.util.Scanner;

public class truongday {

  public static void main(String[] args) {
    System.out.println("Moi ban nhap canh hinh vuong");
    int n = new Scanner(System.in).nextInt();
    int M[] = new int[n * n];
    int b = 1;
    int c = 0;
    int sum = 0;

    for (int i = 0; i < n * n; i++) {
      M[i] = b;
      b += 2;
    }
    for (int i = 0; i < n * n; i++) {
      System.out.print(M[i] + " ");
    }
    System.out.println();
    for (int i = n * n - 1; i >= n - 1; i -= c) {
      System.out.print(M[i] + " ");
      sum += M[i];
      c += 2;
    }
    System.out.println("Gia tri cua sum la: " + sum);
  }
}
