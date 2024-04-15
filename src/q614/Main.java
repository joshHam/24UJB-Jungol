package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();

//		System.out.println(schoolName);
//		System.out.println(grade);

		// Person instance 2
		Person p1 = new Person();
		Person p2 = new Person(schoolName, grade);
		
		p1.print(); 
		p2.print(); 
	}
}

class Person {
	private String schoolName;
	private int grade;

	// constructor
	public Person() {
		this.schoolName = "Jejuelementary";
		this.grade = 6;
	}

	public Person(String schoolName, int grade) {
		this.schoolName = schoolName;
		this.grade = grade;
	}

	// get/set method

	// print method
	public void print() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}