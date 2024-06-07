package q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		 
		if(A<B) {
		for(int i=A;i<=B;i++) {
			System.out.print(i+" ");
		}
		}else {
			for(int i=B;i<=A;i++) {
				System.out.print(i+" ");
			}	
		}
	}

}
