package q1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		
		int c = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c + " ");
				c=c+n;
			}
			System.out.println();
			c=i+2;
		}

	}

}