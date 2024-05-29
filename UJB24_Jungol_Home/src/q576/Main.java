package q576;

import java.util.Scanner;

public class Main {//통과안됨

	public int Cal (int A, char S, int b) {
		int res = 0;
		
		if(S!='+' && S!='-' && S!='*' && S!='/') {
			return res;
		}else {
//			res = (int)A+Integer.toString(S)(int)b;
			
			
			return (A+S+b);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String S = sc.next();
		int b = sc.nextInt();
		sc.close();
		
		Main m;/* 레퍼런스변수 선언 */
		m = new Main();/* 인스턴스 생성 */

		System.out.println(m.Cal(A, S.charAt(0), b));
		
	}

}
