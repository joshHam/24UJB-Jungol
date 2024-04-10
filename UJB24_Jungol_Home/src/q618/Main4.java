package q618;
import java.util.Scanner;

public class Main4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);

      int iCount = 5;
      Infomation[] info = new Infomation[iCount];

      for (int i = 0; i < iCount; ++i) {
         String input = sc.nextLine();
         String[] element = input.split("\\s+");
         info[i] = new Infomation(element[0], element[1], element[2]);
      }
      
      /*List<Infomation> list = new ArrayList<Main.Infomation>();
      
      for(int i = 0; i < info.length; ++i)
         list.add(info[i]);
      
      list.sort(new Comparator<Infomation>() 
      {
         public int compare(Infomation a, Infomation b)
         {
            int reuslt = Integer.parseInt(a.height) - 
                  Integer.parseInt(b.height);
            return reuslt;
         }
      });
      
      for(Infomation a : list)
         System.out.println(a.name + " " + a.height + " " + a.weight);
      */
      SortName(info,iCount);
      System.out.println("");
      SortWeitght(info,iCount);

   }
   
   public static void SortWeitght(Infomation[] info, int iCount)
   {
      System.out.println("weight");
      Infomation[] info_buff = new Infomation[iCount];

      for (int i = 0; i < iCount; ++i) {
         Infomation temp = info[i];
         info_buff[i] = info[i];

         for (int j = i; j < iCount; ++j) {
            if (i == j)
               continue;

            if (Float.parseFloat(temp.getWeight()) < 
               Float.parseFloat(info[j].getWeight())) {
               info_buff[i] = info[j];
               temp = info[j];

               // info[j] change info[i]
               Infomation save = info[i];					//SWAP	
               info[i] = info[j];
               info[j] = save;
            }
         }
      }

      for (Infomation a : info_buff) {
         System.out.println(a.getName() + " " + a.getHeight() + " " + a.getWeight());
      }
      return;
   }

   public static void SortName(Infomation[] info, int iCount) {
      // sort
      System.out.println("name");
      Infomation[] info_buff = new Infomation[iCount];

      for (int i = 0; i < iCount; ++i) {
         Infomation temp = info[i];
         info_buff[i] = info[i];

         for (int j = i; j < iCount; ++j) {
            if (i == j)
               continue;

            if (temp.getName().charAt(0) > info[j].getName().charAt(0)) {
               info_buff[i] = info[j];
               temp = info[j];

               // info[j] change info[i]
               Infomation save = info[i];
               info[i] = info[j];
               info[j] = save;
            }
         }
      }

      for (Infomation a : info_buff) {
         System.out.println(a.getName() + " " + a.getHeight() + " " + a.getWeight());
      }
      return;
   }
   
   public static class Infomation {
      private String name;
      private String height;
      private String weight;
      
      public Infomation(String name, String height, String weight)
      {
         this.name = name;
         this.height = height;
         this.weight = weight;
      }
      
      public String getName() {
         return name;
      }
      public void setName(String name) {
         this.name = name;
      }
      public String getHeight() {
         return height;
      }
      public void setHeight(String height) {
         this.height = height;
      }
      public String getWeight() {
         return weight;
      }
      public void setWeight(String weight) {
         this.weight = weight;
      }
   }
}