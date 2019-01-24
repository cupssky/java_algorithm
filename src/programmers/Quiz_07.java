package programmers;

import java.util.Arrays;

//김서방의 위치
public class Quiz_07 {

  public String findKim(String[] seoul) {
    //x에 김서방의 위치를 저장하세요.
    int x = Arrays.asList(seoul).indexOf("Kim");

    return "김서방은 " + x + "에 있다";
  }
}
