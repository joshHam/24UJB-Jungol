package q618;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Comparator;

public class Main3 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      info[] persons = new info[5];

      for (int i = 0; i < 5; i++) {
         String name = sc.next();
         int height = sc.nextInt();
         double weight = sc.nextDouble();

         persons[i] = new info(name, height, weight);

      }
      sc.close();
      
      
      
      Arrays.sort(persons, Comparator.comparing(info::getName));//간단하게 비교
      System.out.println("name");
      for (int i = 0; i < 5; i++) {

         persons[i].print();

      }

      
      System.out.println();
      
      
      System.out.println("weight");
      Arrays.sort(persons, Comparator.comparingDouble(info::getweight).reversed());
   
      for (int i = 0; i < 5; i++) {
         persons[i].print();
      }

   }

}

class info {
   private String name;
   private int height;
   private double weight;

   public info(String name, int height, double weight) {
      this.name = name;
      this.height = height;
      this.weight = weight;
   }

   public void print() {
      System.out.println(name + " " + height + " " + weight);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getheight() {
      return height;
   }

   public void setheight(int height) {
      this.height = height;
   }

   public double getweight() {
      return weight;
   }

   public void setweight(double weight) {
      this.weight = weight;
   }
}