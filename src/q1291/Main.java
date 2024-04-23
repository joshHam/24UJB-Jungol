package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s;
		int e;

		for (;;) {
			s = sc.nextInt();
			e = sc.nextInt();
			if (e <= 9 && s <= 9) {
				if (e >= 2 && s >= 2) {
					sc.close();
//					print
//					System.out.println(s);
//					System.out.println(e);
					break;
				} else
					System.out.println("INPUT ERROR!");
			} else
				System.out.println("INPUT ERROR!");
		}

		if (e > s) {
			for (int i = 1; i < 10; i++) {
				for (int j = s; j <= e; j++) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i < 10; i++) {
				for (int j = s; j >= e; j--) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
				}
				System.out.println();
			}
		}
	}
}
