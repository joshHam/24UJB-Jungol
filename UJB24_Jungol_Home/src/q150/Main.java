package q150;

import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] charr = new String[10];
		
		for(int i =0;i<charr.length;i++) {
			charr[i]=sc.next();  
		}sc.close();
		
		
		//print
//		for(int i =0;i<charr.length;i++) {
//			System.out.print(charr[i]+" ");
//		}sc.close();
//	
//		System.out.println();
		
		
		
		//�떟Answer
		for(int i= charr.length-1;i>=0;i--) {
			
		System.out.print(charr[i]+" ");
		
		}
		
		
		
	}

}
