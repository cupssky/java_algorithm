package labs.level6.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

//문자열 정렬
public class Quiz_04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    String[] array = new String[n];
    HashSet<String> hashSet = new HashSet<>();

    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextLine();
      hashSet.add(array[i]);
    }

    int setSize = hashSet.size();
    String[] sortedArray = new String[setSize];
    hashSet.toArray(sortedArray);

    Arrays.sort(sortedArray, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
      }
    });

    for (String output : sortedArray) {
      System.out.println(output);
    }
  }
}
//http://blog.naver.com/PostView.nhn?blogId=occidere&logNo=220869372814