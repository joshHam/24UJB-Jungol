package q618;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
   static Map<String, Student> students = new HashMap<>();			//Map

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i < 5; i ++) {
         String name = sc.next();
         int height = sc.nextInt();
         float weight = sc.nextFloat();
         
         Student student = new Student(name, height, weight);
         students.put(name, student);
      }
      sc.close();
      // 이름 정렬
      List<Student> nameset = new ArrayList<>(students.values());
      Collections.sort(nameset, new Comparator<Student>() {

         @Override
         public int compare(Student s1, Student s2) {
            // TODO Auto-generated method stub
            return s1.getName().compareTo(s2.getName());
         }
      });
      System.out.println("name");
      for(Student student: nameset) {
         
         System.out.println(student.getName() + " " + student.getHeight() + " " + student.getWeight());
      }
      // 몸무게 정렬
      List<Student> valueset = new ArrayList<>(students.values());
      Collections.sort(valueset, new Comparator<Student>() {

         @Override
         public int compare(Student s1, Student s2) {
            // TODO Auto-generated method stub
            return Float.compare(s2.getWeight(), s1.getWeight());
         }
      });
      
      System.out.println();
      
      System.out.println("weight");
      for(Student student : valueset) {
         System.out.println(student.getName() + " " + student.getHeight() + " " + student.getWeight());
      }

   }

}
class Student {
   private String name;
   private int height;
   private float weight;
   
   public Student(String name, int height, float weight) {
      this.name = name;
      this.height = height;
      this.weight = weight;
   }
   
   public String getName() {
      return name;
   }
   
   public int getHeight() {
      return height;
   }
   
   public float getWeight() {
      return weight;
   }
}

