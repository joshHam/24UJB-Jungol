package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		// print
//		for(int i=0;i<inp.length;i++) {
//		System.out.print(inp[i]+" ");
//		}		

		
		//내 풀이
		int max = inp[0]; //	int max = Integer.MAX_VALUE;
		int min = inp[0];//		int min = Integer.MIN_VALUE;

		for (int i = 0; i < inp.length; i++) {
			if (inp[i] < 100) {
				max = inp[i];
			} else {
				min = inp[i];
			}
			for (int j = inp.length - 1; j >= 0; j--) {
				if (min > inp[j] && inp[j] >= 100) {
					min = inp[j];
				}
				if (max <= inp[j] && inp[j] < 100) {
					max = inp[j];
				}
			}

		}

		if (max == inp[0] && inp[0] >= 100) {
			max = 100;
		}
		if (min == inp[0] && inp[0] < 100) {
			min = 100;
		}

		System.out.print(max + " " + min);

		
		
		
//		int max = Integer.MAX_VALUE;
//		int min = Integer.MIN_VALUE;
//		
//		for (int i = 0; i < inp.length; i++) {
//			if(inp[i]<100&&inp[i]>max) {
//				max=inp[i];
//			}
//			if(inp[i]>=100&&inp[i]<=max) {
//				min=inp[i];
//			}
//		}
//		
//		System.out.print(max + " " + min);
		
		
		
		
		
		
		
		
		
		
		
	}
}