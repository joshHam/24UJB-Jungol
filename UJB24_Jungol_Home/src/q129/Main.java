package q129;

import java.util.Scanner;

public class Main {
	//다른풀이 메소드만들기
//	public static double area(int base, int height) {
//		double ret = base*height/2;
//		return ret;
//	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char charr2 = '\0'; //c를 null로 초기화
		
		//내풀이도 맞음(charr2 null초기화는 없음)
//		while(true) {
//
//				System.out.print("Base = ");
//				int b = sc.nextInt();
//				
//				System.out.print("Height = ");
//				int h = sc.nextInt();
//				
//				System.out.printf("Triangle width = %.1f \n" ,(double)b*(double)h/2);
//
//				System.out.print("Continue? ");
//				char charr2 = sc.next().charAt(0);
//				
//			if(charr2=='Y'||charr2=='y') {
//				continue;
//			}else {
//				break;
//			}
//		}sc.close();
//		
		
		
		//do-while풀이
		do {
			System.out.print("Base = ");
			int b = sc.nextInt();
			
			System.out.print("Height = ");
			int h = sc.nextInt();
			
			System.out.printf("Triangle width = %.1f \n" ,(double)b*(double)h/2);
			System.out.print("Continue? ");
			charr2 = sc.next().charAt(0);
			
		}while(charr2=='Y'||charr2=='y');
		sc.close();
	}
	
	
	

}
