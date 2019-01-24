package programmers;

import java.util.Arrays;

//문자열 내림차순으로 정렬하기
public class Quiz_01 {

  public String reverseStr(String str) {
    char[] sol = str.toCharArray();
    Arrays.sort(sol);
    return new StringBuilder(new String(sol)).reverse().toString();
  }
}

