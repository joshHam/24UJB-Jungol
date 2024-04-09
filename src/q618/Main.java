package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] person = new Person[5];//객체배열의 '공간'을 만듬

		for (int i = 0; i < person.length; i++) {	//객체배열의 실제 '인스턴스'를 생성
			String p = sc.next();
			int h = sc.nextInt();	
			float w = sc.nextFloat();

			person[i] = new Person(p, h, w);
		}
		sc.close();

		// print
//		for(int i=0;i<person.length;i++) {
//		person[i].print();
//		}
//		System.out.println();

		
		//강사님 코드
		Arrays.sort(person, /**/new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				String name1 = o1.getName();
				String name2 = o2.getName();
				
				int stlen = Math.min(name1.length(), name2.length());
				for(int i=0; i<stlen;i++) {
					if(name1.charAt(i)!=name2.charAt(i)) {
						return name1.charAt(i)-name2.charAt(i);
					}
				}
				return 0;
			}
		});

		System.out.println("name");
		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}
		System.out.println();
		
		//몸무게순 정렬
		Arrays.sort(person, /**/new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				double weight1 = o1.getWeight();
				double weight2 = o2.getWeight();

					if (weight1 > weight2)
						return -1;
					else if (weight1 == weight2)
						return 0;
					else
						return 1;
			
			}
		});

		System.out.println("weight");
		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
			//내풀이 코드(617번복사)
//		Arrays.sort(person, /**/new Comparator<Person>() {
//
//			public int compare(Person n1, Person n2) {
//				String nh1 = n1.getName();
//				String nh2 = n2.getName();
//				if (nh1.charAt(0) < nh2.charAt(0))
//					return -1;
//				else if (nh1 == nh2)
//					return 0;
//				else
//					return 1;
//			}
//
//		});
//
//		System.out.println("name");
//		for (int i = 0; i < person.length; i++) {
//			person[i].print();
//		}
//		System.out.println();
//
//		Arrays.sort(person, new Comparator<Person>() {
//
//			public int compare(Person w1, Person w2) {
//				float nh1 = w1.getWeight();
//				float nh2 = w2.getWeight();
//				if (nh1 > nh2)
//					return -1;
//				else if (nh1 == nh2)
//					return 0;
//				else
//					return 1;
//			}
//
//		});
//
//		System.out.println("weight");
//		for (int i = 0; i < person.length; i++) {
//			person[i].print();
//		}
//		System.out.println();

	}
	
}



class Person {
	private String name;
	private int height;
	private float weight;

	public Person(String name, int height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public float getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

}