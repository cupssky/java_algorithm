package sw.d2;

import java.util.Base64;
import java.util.Scanner;

/*
    |--------------------------------------------------------------------------
    | Note. Base64 Decoder
    |--------------------------------------------------------------------------
*/
public class Quiz_1928 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int num = 1;
    while (t-- > 0) {
      String v = scanner.next();
      String value = new String(Base64.getDecoder().decode(v));
      System.out.println("#" + num + " " + value);
      num++;
    }
  }
}
