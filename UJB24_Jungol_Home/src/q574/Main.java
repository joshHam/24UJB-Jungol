package q574;

import java.util.Scanner;//함수

public class Main {
	public/* static 안붙임 */int/* 정수값 */ hjMax(int n1, int n2, int n3) {

		int Max = 0;

		if (n1 >= n2) {
			if (n1 >= n3)
				Max = n1;
		} else if (n2 >= n3) {
			Max = n2;
		} else {
			Max = n3;
		}

		return Max;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

		Main m;/* 레퍼런스변수 선언 */
		m = new Main();/* 인스턴스 생성 */

		System.out.println(m.hjMax(num1, num2, num3));

		int r = m.hjMax(num1, num2, num3);
		System.out.println(r);

	}

}
