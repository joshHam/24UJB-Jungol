package q183;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] charr=new String[1];
		

		charr[0]=sc.next();
		sc.close();
		
		for(int i=0;i<5;i++) {
			System.out.print(charr[0].charAt(i));
		}

	}

}
