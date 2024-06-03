package q1309;

import java.util.Scanner;

public class Main {	//DP(memoization)방법풀이	//재귀방법풀이도찾기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long res = 1;
		
		for(int i=n;i>0;i--) {
			if(i>1) {
			System.out.printf("%d! = %d * %d! %n", i, i, i-1);
			}else {
				System.out.println("1! = 1");
			}
			res*=i;
				
		}
		System.out.println(res);
		
	}

}