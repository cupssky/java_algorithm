package labs.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//테트리스
public class Quiz_02 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] cols = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(cols[0]);
    int m = Integer.parseInt(cols[1]);
    int[][] array = new int[m][n];
    int count = 0;
    int clearBlock = 0;
    int clear = 0;
    int maxCount = 0;
    int location = 0;

    for (int i = 0; i < m; i++) {
      String[] value = bufferedReader.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        array[i][j] = Integer.parseInt(value[j]);
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (array[i][j] == 1) {
          if (i + 1 > 4) {
            int idxI = i;
            int idxJ = j;
            for (int k = 0; k < idxI; k++) {
              if (array[k][idxJ] == 0) {
                count++;
              }
            }
            //System.out.println(count);
            if (count >= 4) {
              if (maxCount < count) {
                maxCount = count;
                location = idxJ;
              }
            }
            count = 0;
          }
        }
      }
    }

    if (maxCount == 0) {
      for (int j = 0; j < n; j++) {
        if (array[n - 1][j] == 0) {
          location = j;
        }
      }
    }

    for (int i = n - 1; i >= 0; i--) {
      if (array[i][location] == 0) {
        array[i][location] = 1;
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (array[i][j] == 1) {
          clearBlock++;
        }
      }
      if (clearBlock == n) {
        clear++;
      }
      clearBlock = 0;
    }

    System.out.print(location + 1);
    System.out.print(" ");
    System.out.print(clear);
  }
}
