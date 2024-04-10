package q613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();

//		System.out.println(name);
//		System.out.println(schoolName);
//		System.out.println(grade);

//		Student st1 = new Student();
//		st1.setName(name);
//		st1.setSchoolName(schoolName);
//		st1.setGrade(grade);
		Student st2 = new Student(name, schoolName, grade);

//		System.out.println("Name : " + st1.getName());
//		System.out.println("School : " + st1.getSchoolName());
//		System.out.println("Grade : " + st1.getGrade());
		st2.print();
	}
}

class Student {
	private String name;
	private String schoolName;
	private int grade;

	public Student(String name, String schoolName, int grade) {
		this.name = name;
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + schoolName);
		System.out.println("Grade : " + grade);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}