import java.util.ArrayList;
import java.util.Scanner;

public class Test {

  static int n;
  static int cnt = 4;
  static int s = 3;
  static int de_s;

  //   static ArrayList<Integer> list = new ArrayList<Integer>();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    Moo(list);
  }

  static void Moo(ArrayList<Integer> list) {
    if ((2 * s + cnt) < n) {
      s = 2 * s + cnt;
      list.add(s);
      cnt++;
      Moo(list);
    } else {
      de_s = list.size() - 1;
      de_Moo(de_s, list);
    }
  }

  static void de_Moo(int de_s, ArrayList<Integer> list) {
    if (de_s >= 0) {
      int t = list.get(de_s);
      if (t >= n) {
        de_s--;
        cnt--;
        de_Moo(de_s, list);
      } else if (t + cnt < n) {
        n -= (t + cnt);
        de_s--;
        cnt--;
        de_Moo(de_s, list);
      } else if (t < n && t + cnt >= n) {
        if (n == t + 1) {
          System.out.println('m');
        } else {
          System.out.println('o');
        }
      }
    } else {
      if (n == 1) {
        System.out.println('m');
      } else {
        System.out.println('o');
      }
    }

  }
}
