package baekjoon.sorts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Quiz_11652 {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    BigInteger[] a = new BigInteger[n];

    for (int i = 0; i < n; i++) {
      a[i] = new BigInteger(bufferedReader.readLine());
    }
    Arrays.sort(a);

    BigInteger pre = a[0];
    int count = 0;

    BigInteger most = BigInteger.ZERO;
    int mostCount = 0;

    for (int i = 0; i < n; i++) {
      if (!pre.equals(a[i])) {
        if (mostCount < count) {
          mostCount = count;
          most = pre;
        }
        count = 1;
        pre = a[i];
      } else {
        count++;
      }
    }
    if (mostCount < count) {
      most = pre;
    }

    // 결과 값 출력 (가장 많이 등장한 아이템 값)
    System.out.println(most);
  }
}
