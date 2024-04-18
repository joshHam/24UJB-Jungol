package q127;

import java.util.Scanner;

public class Main {							//내풀이 런타임에러
											
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] N = new int[101];				//큰 배열을 선언할 필요가 없다

		double Sum = 0;

		while (true) {
			for (int i = 0; i < N.length+1; i++) {
				N[i] = sc.nextInt();

				if (N[i] > 100) {
					for (int j = 0; j < i; j++) {
						Sum += N[j];
					}
					System.out.println("sum : " + (int) Sum);
					System.out.printf("sum : %.1f", Sum / i);

				}

				if (N[i] < 0) {
					for (int j = 0; j < i; j++) {
						Sum += N[j];
					}
					System.out.println("sum : " + (int) Sum);
					System.out.printf("avg : %.1f", Sum / i);
					
				}


			}
			
			sc.close();
			break;
		}

	}

}
