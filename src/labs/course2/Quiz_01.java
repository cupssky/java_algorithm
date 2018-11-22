package labs.course2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_01 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] cols = bufferedReader.readLine().split(" ");
    int width = Integer.parseInt(cols[0]);
    int height = Integer.parseInt(cols[1]);
    int[][] array = new int[height][width];

    for (int i = 0; i < height; i++) {
      String[] value = bufferedReader.readLine().split(" ");
      for (int j = 0; j < width; j++) {
        array[i][j] = Integer.parseInt(value[j]);
      }
    }

    int compareLength = height;
    int findWidthIndex = -1;

    while (compareLength > 3 && -1 == findWidthIndex) {
      for (int i = 0; i < width; i++) {
        findWidthIndex = i;
        break;
      }
      if (-1 == findWidthIndex) {
        compareLength--;
      }
    }

    if (-1 == findWidthIndex) {
      System.out.print(0 + " " + 0);
    } else {
      int checkBlankLine = compareLength - 1;
      int canClearLineNum = 0;

      while (checkBlankLine >= compareLength - 4) {
        boolean satisfied = true;
        for (int i = 0; i < width; i++) {
          if (i == findWidthIndex) {
            continue;
          }
          satisfied = false;
          break;
        }
        if (satisfied) {
          canClearLineNum++;
        }
        --checkBlankLine;
      }

      if (0 == canClearLineNum) {
        System.out.print(0 + " " + 0);
      } else {
        System.out.print(findWidthIndex + " " + canClearLineNum);
      }
    }
  }
}
