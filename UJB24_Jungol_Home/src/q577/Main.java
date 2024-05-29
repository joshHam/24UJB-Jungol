package q577;

import java.util.Scanner;//김성윤풀이


class Mat {
   public int getD() {
      return D;
   }
   public void setD(int d) {
      D = d;
   }
   public int getE() {
      return E;
   }
   public void setE(int e) {
      E = e;
   }
   int D ;
   int E;
   
}
public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      Mat mat = new Mat();
      mat.setD(A);
      mat.setE(B);
      
      if (mat.getD()>mat.getE()) {
         System.out.print(mat.getD()/2+ " ");
         System.out.print(mat.getE()*2);
      }
      else if (mat.getD()<mat.getE()) {
         System.out.print(mat.getD()*2+ " ");
         System.out.print(mat.getE()/2+ " ");
      }
   }

}