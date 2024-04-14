package q151;

import java.util.Scanner;

public class Main {  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]i= new int[5];
		
		for(int j=0;j<i.length;j++) {
			i[j]=sc.nextInt();
		}sc.close();
		
		
		System.out.print(i[0]+i[2]+i[4]);
	}

}
