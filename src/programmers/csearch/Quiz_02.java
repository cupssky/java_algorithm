package programmers.csearch;

import java.util.TreeSet;

/*
    |--------------------------------------------------------------------------
    | Note. 소수 찾기
    |--------------------------------------------------------------------------
*/
public class Quiz_02 {

  TreeSet<Integer> ts = new TreeSet<>();

  public int solution(String numbers) {
    int answer = 0, check, i;
    func("", numbers);

    for (int num : ts) {
      check = 0;
      for (i = 2; i < num; i++) {
        if (num % i == 0) {
          break;
        }
      }
      if (i == num) {
        answer++;
      }
    }
    return answer;
  }

  public void func(String s, String number) {
    if (number.length() == 0) {
      if (!s.equals("")) {
        ts.add(Integer.parseInt(s));
      }
    } else {
      for (int i = 0; i < number.length(); i++) {
        func(s + number.charAt(i),
            number.substring(0, i) + number.substring(i + 1, number.length()));
      }
      for (int i = 0; i < number.length(); i++) {
        func(s, number.substring(0, i) + number.substring(i + 1, number.length()));
      }
    }
  }
}


class Solution {

  public int solution(String numbers) {
    int answer = 0;
    boolean[] data = new boolean[10000001];
    for (int i = 0; i < data.length; i++) {
      data[i] = true;
    }
    for (int i = 2; i < data.length; i++) {
      if (data[i]) {
        for (int j = i * 2; j < data.length; j += i) {
          data[j] = false;
        }
      }
    }
    data[1] = false;

    int[] nArr = toNumArray(numbers);
    for (int i = 2; i < data.length; i++) {
      if (data[i]) {
        int[] iArr = toNumArray(Integer.toString(i));
        if (isPossible(nArr, iArr)) {
          answer++;
        }
      }
    }

    return answer;
  }

  int[] toNumArray(String s) {
    int[] result = new int[10];
    for (int i = 0; i < s.length(); i++) {
      result[s.charAt(i) - '0']++;
    }
    return result;
  }

  boolean isPossible(int[] nArr, int[] iArr) {
    for (int i = 0; i < 10; i++) {
      if (nArr[i] < iArr[i]) {
        return false;
      }
    }
    return true;
  }
}
