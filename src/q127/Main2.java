package q127;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, inp = 0, cnt =0;
		
		do {
			inp = sc.nextInt();
			sum += inp;
		}while(0<=inp && inp<=100);
		
		sc.close();
		sum-=inp;
		cnt--;
		
		System.out.println("sum : "+ sum);
		System.out.printf("avg : %.1f\n",(double)sum/cnt);
	}

}
