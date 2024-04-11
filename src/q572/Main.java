package q572;

import java.util.Scanner;

public class Main {
	public double calArea(int r) {
		double area = r * r * 3.14;

		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);

		Main m = new Main();
		double area = m.calArea(inp);
		System.out.printf("%.2f\n", area);
	}
}