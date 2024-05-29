package q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		if (s > e) {
			for (int i = s; i >= e; i--) {
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %2d   ", s, j, s * j);
					if (j % 3 == 0)
						System.out.println();
				}
				System.out.println();
				s--;
			}
		} else {
			for (int i = s; i <= e; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %2d   ", s, j, s * j);
					if (j % 3 == 0)
						System.out.println();
				}
				System.out.println();
				s++;
			}
		}
	}
}