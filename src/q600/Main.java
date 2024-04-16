package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		sc.close();

//		System.out.println(inp);

		// 방법1
//		String[]inpS=inp.split(" ");
//
//		int i = 0;
//		for(int j=0;j<inpS.length;j++) {
//			i++;
//		}
//		System.out.println(inpS.length);
//		System.out.println(i);

		// 방법2
		StringTokenizer st = new StringTokenizer(inp, " ");

		System.out.println(st.countTokens());

	}

}
