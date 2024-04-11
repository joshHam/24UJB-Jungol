package q198;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parent[] parent = new Parent[2];

		for (int i = 0; i < parent.length; i++) {
			int height = sc.nextInt();
			double weight = sc.nextDouble();

			parent[i] = new Parent(height, weight);
		}
		sc.close();

		int Hsum = 0;
		double Wsum = 0;
		int p = parent.length;

		for (int i = 0; i < parent.length; i++) {
			Hsum += parent[i].getHeight();
			Wsum += parent[i].getWeight();
		}

		System.out.println("height : " + (Hsum / p + 5) + "cm");
		System.out.printf("weight : %.1fkg", Wsum / p - 4.5);

	}

}

class Parent {
	private int height;
	private double weight;

	public Parent(int height, double weight) {
		this.height = height;
		this.weight = weight;
	}

//	public void Print() {
//		
//		System.out.println("height : "+Hsum/p+"cm");
//	}
//	

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}