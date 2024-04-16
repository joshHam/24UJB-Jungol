package q195;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String person = sc.nextLine();//sc.next() 3개로 받으면 더 편함
		sc.close();

		StringTokenizer st = new StringTokenizer(person);
		String[] info = new String[3];

		for (int i = 0; i < info.length; i++) {
//			if(st.hasMoreTokens()) {
			info[i] = st.nextToken();
//			}
		}

		Person p = new Person(info[0], info[1], info[2]);

		p.Print();

	}

}

class Person {
	private String name;
	private String phone;
	private String address;

	public Person(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public void Print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + phone);
		System.out.println("addr : " + address);
	}

}