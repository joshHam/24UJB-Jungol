package q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int []arr = new int[10];
		Integer[]arr2 = new Integer[10];
		
		for(int i=0; i<arr2.length;i++) {
			arr2[i]= sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr2, Collections.reverseOrder());
		
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
