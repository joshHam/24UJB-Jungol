package q132;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int Sum = 0;
		for(int i=1;i<=N;i++) {
			if(i%5==0) {
				Sum+=i;
			}
		}
		System.out.println(Sum);
	}

}
