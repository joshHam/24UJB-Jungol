package q574;

import java.util.Scanner;		

public class Main2 {
	   
	   public static void Max(int a[]) {
	      int max = Integer.MIN_VALUE;
	      for(int i=0; i<a.length;i++) {
	         if(a[i]>max) {
	            max = a[i];
	         }
	         
	      }
	      System.out.print(max);
	   }
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a[] = new int[3]; // 들어오는 숫자 개수
	      for(int i=0; i<a.length;i++) {
	         int input = sc.nextInt();
	         a[i]=input;
	      }
	      sc.close();
	      Max(a);				//메소드에 배열넣어줌
	   }
	}
	      
	      