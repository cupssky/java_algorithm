package labs.level2.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//card game
public class Quiz_05 {

  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arrayA = new int[10];
    int[] arrayB = new int[10];
    int winA = 0;
    int winB = 0;
    String[] inputA = bufferedReader.readLine().split(" ");
    String[] inputB = bufferedReader.readLine().split(" ");

    for (int i = 0; i < 10; i++) {
      arrayA[i] = Integer.parseInt(inputA[i]);
      arrayB[i] = Integer.parseInt(inputB[i]);

      if (arrayA[i] > arrayB[i]) {
        winA++;
      } else if (arrayA[i] < arrayB[i]) {
        winB++;
      }
    }

    if (winA > winB) {
      System.out.println("A");
    } else if (winA < winB) {
      System.out.println("B");
    } else {
      System.out.println("D");
    }
    bufferedWriter.flush();
  }
}
