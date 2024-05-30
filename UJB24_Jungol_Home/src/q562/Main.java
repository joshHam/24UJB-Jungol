package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int[]N = new int[10];
	for(int i = 0;i<N.length;i++) {
		N[i]=sc.nextInt();
	}
	sc.close();

//	for(int i = 0;i<N.length;i++) {
//		System.out.print(N[i]+" ");
//	}
	
	int SumEven = 0;
	double SumOdd = 0;
	
	for(int i = 0;i<N.length;i++) {
		if(i%2==0) {
			SumOdd+=N[i];
		}else {
			SumEven+=N[i];
		}
	}
	
	System.out.println("sum : "+SumEven);
	System.out.printf("avg : %.1f",SumOdd/5); //팁 5.0으로 나누면 더블로 타입캐스팅 한것과 같다
	
	
	}

}
