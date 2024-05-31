package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int p = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (i % 2 == 0) {
					System.out.print(p++ + " ");
				} else {
					System.out.print(p-- - 1 + " ");
				}
			}
			System.out.println();
			p = p + m;
		}

	}

}
