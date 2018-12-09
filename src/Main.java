import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] cols = bufferedReader.readLine().split(" ");
    int N = Integer.parseInt(cols[0]);

    String[][] mapArray = new String[N][N];
    String[] value = bufferedReader.readLine().split(" ");
    int X = Integer.parseInt(value[0]) - 1;
    int Y = Integer.parseInt(value[1]) - 1;
    int range = Integer.parseInt(value[2]);

    for (int i = 0; i < mapArray.length; i++) {
      for (int j = 0; j < mapArray.length; j++) {
        if (i == X && j == Y) {
          mapArray[X][Y] = "x";
        } else {
          mapArray[i][j] = "0";
        }
      }
    }

    for (int i = 1; i < range + 1; i++) { //1부터 시작
      if (X - i >= 0) {
        mapArray[X - i][Y] = String.valueOf(i);
      }
      if (X + i <= N) {
        mapArray[X + i][Y] = String.valueOf(i);
      }
      if (Y - i >= 0) {
        mapArray[X][Y - i] = String.valueOf(i);
      }
      if (Y + i <= N) {
        mapArray[X][Y + i] = String.valueOf(i);
      }
      for (int j = 1; j < i; j++) {
        if (Y - j >= 0) {
          if (X - i + j >= 0 && X - i + j <= N) {
            //좌상단
            mapArray[X - i + j][Y - j] = String.valueOf(i);
          }
          if (X + i - j >= 0 && X + i - j <= N) {
            //우상단
            mapArray[X + i - j][Y - j] = String.valueOf(i);
          }
        }
        if (X - j >= 0) {
          if (Y + i - j >= 0 && Y + i - j <= N) {
            //좌하단
            mapArray[X - j][Y + i - j] = String.valueOf(i);
          }
        }
        if (X + j >= 0 && X + j <= N) {
          if (Y + i - j >= 0 && Y + i - j <= N) {
            //우하단
            mapArray[X + j][Y + i - j] = String.valueOf(i);
          }
        }
      }

    }

    //값 출력
    for (int i = 0; i < mapArray.length; i++) {
      for (int j = 0; j < mapArray.length; j++) {
        System.out.print(mapArray[i][j] + " ");
      }
      System.out.println();
    }
  }
}