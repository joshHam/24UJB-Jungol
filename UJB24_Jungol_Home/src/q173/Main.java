package q173;

import java.util.Scanner;

public class Main {
	public int hjPow(int i1, int i2) {
		int res =0;
		if(i1>=i2) {
			res+=i1*i1-i2*i2;
		}else {
			res+=i2*i2-i1*i1;
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		sc.close();
		
		Main m = new Main();
		int r =m.hjPow(N1, N2);
		System.out.println(r);
		
	}

}
