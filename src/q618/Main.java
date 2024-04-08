package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[]person = new Person[5];
		
		for(int i=0;i<person.length;i++) {
			String p = sc.next();
			int h = sc.nextInt();
			float w = sc.nextFloat();
			
			person[i] = new Person(p, h, w);
		}sc.close();
		
		
		
		//print
//		for(int i=0;i<person.length;i++) {
//		person[i].print();
//		}
//		System.out.println();
		
		
		Arrays.sort(person, new Comparator<Person>(){
			
			public int compare(Person n1, Person n2) {
				String nh1 = n1.getName();
				String nh2 = n2.getName();
				if (nh1.charAt(0)<nh2.charAt(0))
					return -1;
				else if(nh1==nh2)
					return 0;
				else
					return 1;
			}
			
		});
		
		
		System.out.println("name");
		for(int i=0;i<person.length;i++) {
		person[i].print();
		}
		System.out.println();
		
		
		Arrays.sort(person, new Comparator<Person>(){
			
			public int compare(Person w1, Person w2) {
				float nh1 = w1.getWeight();
				float nh2 = w2.getWeight();
				if (nh1>nh2)
					return -1;
				else if(nh1==nh2)
					return 0;
				else
					return 1;
			}
			
		});
		
		
		System.out.println("weight");
		for(int i=0;i<person.length;i++) {
		person[i].print();
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}
  
}


class Person{
	private String name;
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	private int height;
	private float weight;
	
	public Person(String name, int height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println(name + " "+ height+" "+weight);
	}
	
	
	
}