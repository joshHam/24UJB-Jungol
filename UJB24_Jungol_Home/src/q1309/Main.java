package q1309;

import java.util.Scanner;

public class Main {	
	
	//재귀방법풀이
	public static long f(long p) {
		if(p == 1) {
			System.out.println("1! = 1");
			return 1;
		}else {
			System.out.println(p + "! = "+p+" * "+(p-1)+"!");
			return p*f(p-1);
		}
	}
	

	
	
	//내풀이	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		long res = 1;
		
		for(long i=n;i>0;i--) {
			if(i>1) {
			System.out.printf("%d! = %d * %d! %n", i, i, i-1);
			}else {
				System.out.println("1! = 1");
			}
			res*=i;
				
		}
		System.out.println(res);
		System.out.println();
		
		//재귀방법정답///////////////////////////////////////
		long ret = f(n);
		System.out.println(ret);
		
	}

}