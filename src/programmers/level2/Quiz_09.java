package programmers.level2;

public class Quiz_09 {

  public static void main(String[] args) {
    int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
    System.out.println(solution(board));
  }

  public static int solution(int[][] board) {
    int answer = 1234;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        //board[i][j]
      }
    }
    return answer;
  }
}
