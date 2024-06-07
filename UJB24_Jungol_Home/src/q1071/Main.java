package q1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		sc.close();
		
		
		int sum = 0;
		int SUM = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]%m == 0) {
				SUM+=arr[i];
			}
			if(m%arr[i] == 0) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		System.out.println(SUM);
	}

}
