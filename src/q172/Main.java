package q172;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();

		Rec r1 = new Rec(i);

		r1.Print();

	}

}

class Rec {
	private int i;

	public Rec(int i) {
		this.i = i;
	}

	public void Print() {

		int l = 1;
		for (int j = 1; j <= i; j++) {

			for (int k = 1; k <= i; k++) {
				System.out.print(k * l + " ");

			}
			System.out.println();
			l++;
		}

//		for (int j = 1; j <= i * i; j++) {
//			System.out.print(j + " ");
//			if (j % i == 0) {
//				System.out.println();
//			}
//		}

	}

}