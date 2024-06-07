package q1430;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      sc.close();

      System.out.println(A + " " + B + " " + C);
      int res = A * B * C;
      System.out.println(res); // 17037300

      int[] cnt = new int[10];

      do {
         int r = res % 10;
         cnt[r]++;
         res = res / 10;
      } while (res != 0);

      for (int i = 0; i < cnt.length; i++) {
         System.out.println(cnt[i]);
      }
   }
}
