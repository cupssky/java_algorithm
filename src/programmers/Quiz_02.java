package programmers;

//가운데 글자 가져오기
public class Quiz_02 {

  String getMiddle(String word) {
    return word.substring((word.length() - 1) / 2, word.length() / 2 + 1);
  }
}
