package q576;

import java.util.Scanner;

public class Main {
	public static void calc(int p1, char o, int p2) {
		int ret = 0;
		
		if(o=='+') {
			ret = p1+p2;
		}else if(o=='-') {
			ret = p1-p2;
		}else if(o=='/') {
			ret = p1/p2;
		}else if(o=='*') {
			ret = p1*p2;
		}else {
			ret = 0;
		}
		
		System.out.printf("%d %c %d = %d\n", p1, o, p2, ret);
//		System.out.println(p1+o+p2+" = "+ret);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opr1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int opr2 = sc.nextInt();
		sc.close();
		
//		System.out.println(opr1);
//		System.out.println(op);
//		System.out.println(opr2);
		
		calc(opr1, op, opr2);
	}

}
