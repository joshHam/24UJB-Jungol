package q174;

import java.util.Scanner;

public class Main {

	public int student(int i1, int i2, int i3) {
		int sumStu = i1+i2+i3;

		return sumStu;
	}

	public int subject(int i1, int i2, int i3) {
		int sumSub = i1+i2+i3;

		return sumSub;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Student = new int[3][3];

		for (int i = 0; i < Student.length; i++) {
			for (int j = 0; j < Student.length; j++) {
				Student[i][j] = sc.nextInt();
			}
		}
		sc.close();

		//print
//		for (int i = 0; i < Student.length; i++) {
//			for (int j = 0; j < Student.length; j++) {
//				System.out.print(Student[i][j]+" ");
//			}System.out.println();
//		}

		
		
		Main m = new Main();
		
		

		int r = 0;
		int k = 0;
		
		for (int i = 0; i < Student.length; i++) {

			for (int j = 0; j < Student.length; j++) {
//				r = m.student(Student[0][j], Student[1][j], Student[2][j]);

				System.out.print(Student[i][j]+" ");
				r+=Student[i][j];
			}
			
			System.out.print(r + " ");

			System.out.println();
			k+=r;
			r=0;
		}
		
		for(int i = 0;i<Student.length;i++) {
		System.out.print(Student[0][i]+Student[1][i]+Student[2][i]+" ");
		}
		System.out.print(k);
		
		
		
		
		
	}

}
