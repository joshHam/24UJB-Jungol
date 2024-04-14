package q571;

import java.util.Scanner;

public class Main {
	public void printStr() {
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);

		Main main = new Main();
		for (int i = 0; i < inp; i++) {
//			printStr();
			main.printStr();
		}
	}
}