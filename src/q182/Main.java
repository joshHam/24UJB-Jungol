package q182;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char charr1 = sc.next().charAt(0);
		char charr2 = sc.next().charAt(0);
		sc.close();
		
		int i = charr1;
		int i2 = charr2;
		
//		System.out.println(i);
//		System.out.println(i2);
		
		if(i>=i2) {
			System.out.print((i+i2)+" "+(i-i2));	
		}else {
			System.out.print((i+i2)+" "+(i2-i));
		}
		
		




	}

}
