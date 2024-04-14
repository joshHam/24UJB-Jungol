package q575;

import java.util.Scanner;

public class Main {

	public int hjPow(int n1, int n2) {
			
		//1.
		int res = 1;
			for(int i = 0;i<n2;i++) {
				res*=n1;
			}
		return res;
		
		//2.
//		return (int) Math.pow(n1, n2);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Main m;
		m = new Main();

//		System.out.println(m.hjSquare(num1, num2));

		
		int r = m.hjPow(num1, num2);
		System.out.println(r);

		
		
		
	}

}
