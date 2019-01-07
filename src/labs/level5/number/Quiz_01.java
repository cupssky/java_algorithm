package labs.level5.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_01 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a1 = Integer.parseInt(st.nextToken());
      int a2 = Integer.parseInt(st.nextToken());
      int a3 = Integer.parseInt(st.nextToken());

      if (a1 == 0 && a2 == 0 && a3 == 0) {
        return;
      }

      if (a1 + a3 == a2 * 2) {
        int value = a3 + a2 - a1;
        System.out.println("AP" + " " + value);
      } else {
        int value = a3 * a2 / a1;
        System.out.println("GP" + " " + value);
      }
    }
  }
}