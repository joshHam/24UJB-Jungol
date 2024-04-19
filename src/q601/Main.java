package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		//1단계 사용자입력& 출력
//		System.out.print(s);
		

		for(int i=1;i<=s.length();i++) {
			for(int j =s.length()-i; j<s.length();j++) { 
			System.out.print(s.charAt(j));
			}
			for(int j=0;j<s.length()-i;j++) {
			System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		
		
		
//		for(int i =0; i<s.length();i++) {
//			System.out.print(s.charAt(i));
//		}
		
		
		
		}
	}	