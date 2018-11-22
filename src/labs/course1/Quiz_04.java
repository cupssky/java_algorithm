package labs.course1;

import java.io.IOException;

public class Quiz_04 {

  public static void main(String[] args) throws IOException {
/*
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] cols = bufferedReader.readLine().split(" ");
    int n = Integer.parseInt(cols[0]);
    int m = Integer.parseInt(cols[1]);
    int[][] array = new int[n][m];

    int zeroCount = 0;
    int oneCount = 0;
    int length = 0;

    int max = 0;
    int clear = 0;
    int locate = 0;

    for (int i = 0; i < array.length; i++) {
      String[] value = bufferedReader.readLine().split(" ");
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = Integer.parseInt(value[j]);
      }
    }

    //0이 4번 이상이면 작대기가 들어갈 곳이 나옴
    //4번이상이면서 가장 많은곳이 작대기 들어갈 곳
    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n; i++) {
        if (array[i][j] == 0) {
          if (zeroCount == 0) {
            zeroCount += 1;
          } else {
            zeroCount++;
            if (zeroCount >= 4) {
              length = zeroCount;
            }
          }
        } else {
          zeroCount = 0;
        }
      }
      if (length > max) {
        max = length;
        locate = j + 1;
      }
      zeroCount = 0;
    }

    // 길이 -1 이 삭제가능한 줄
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (array[i][j] == 1) {
          oneCount++;
          if (oneCount == m) {
            if (clear == 0) {
              clear = 0;
            }
            clear -= 1;
          }
          if (oneCount == m - 1) {
            if (array[i][j] == array[i - 1][j]) {
              clear++;
            } else if (clear > 1) {
              clear = 1;
            } else {
              continue;
            }
          }
        }
      }
      oneCount = 0;
    }

    //출력
    if (max > 0 && clear > 0) {
      System.out.println(locate + " " + clear);
    } else {
      locate = 0;
      clear = 0;
      System.out.println(locate + " " + clear);
    }*/

  }
}