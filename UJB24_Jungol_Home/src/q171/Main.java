package q171;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		Cal c1 = new Cal(inp);
		
		c1.print();  

	}

}

class Cal{
	
	private int num;
	
	
	//생성자는 void 안쓰나?
	public Cal(int num) {
		this.num=num;
	}
	
	public void print(){
		
		int sum =0;
		for(int i=0;i<=num;i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	
	
}