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
    System.out.println("______________________________________________________________________");

    System.out.println("Moi ban nhap canh hinh vuong");
		int n=new Scanner(System.in).nextInt();
		int M[][]=new int[n][n];
		int h1=0;
		int h2=n-1;
		int c1=0;
		int c2=n-1;
		int count=1;
		while(h1<=h2 && c1<=c2) {
			for(int i=c1;i<=c2;i++) {
				M[h1][i]=count;
				count+=2;
			}
			h1++;
			for(int j=h1;j<=h2;j++) {
				M[j][c2]=count;
				count+=2;
			}
			c2--;
			for(int m=c2;m>=c1;m--) {
				M[h2][m]=count;
				count+=2;
			}
			h2--;
			for(int k=h2;k>=h1;k--) {
				M[k][c1]=count;
				count+=2;
			}
			c1++;
		
		}
		for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            System.out.print(M[i][j]+"   ");
	        }
	        System.out.println();
	    }
		System.out.println("____________");
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	        	if(i==j) {
	            System.out.print(M[i][j]+"   ");
	        	}
	        }
	    }
	    System.out.println();
	    System.out.println("____________");
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	        	if(n-j==i+1) {
	            System.out.print(M[i][j]+"   ");
	        	}
	        }
	    }
  }
}
