package q133;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double sum = 0;
		for(int i=0;i<n;i++) {
			int T = sc.nextInt();
			sum+=T;
		}sc.close();
		
		
		System.out.printf("%.2f",sum/n);
	}

}
