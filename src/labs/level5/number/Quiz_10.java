package labs.level5.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//fractionsum
public class Quiz_10 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] array = new int[2][2];
    //분자
    int moleculeA = 0;
    int moleculeB = 0;
    //분모
    int denominatorA = 0;
    int denominatorB = 0;
    for (int i = 0; i < 2; i++) {
      String[] inputs = bufferedReader.readLine().split(" ");
      for (int j = 0; j < 2; j++) {
        array[i][j] = Integer.parseInt(inputs[j]);
      }
    }

    moleculeA = array[0][0];
    denominatorA = array[0][1];
    moleculeB = array[1][0];
    denominatorB = array[1][1];

    System.out.print(moleculeA * denominatorB + moleculeB * denominatorA);
    System.out.print(" ");
    System.out.print(denominatorA * denominatorB);
    bufferedWriter.flush();
  }
}
