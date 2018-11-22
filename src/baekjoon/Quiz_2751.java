package baekjoon;

public class Quiz_2751 {

  static int result[];

  public static void main(String[] args) {

  }

  public static void merge(int left, int mid, int right, int[] arr) {
    int l = left;
    int m = mid + 1;
    int k = left;

    for (int i = left; i < right + 1; i++) {
      arr[i] = result[i];
    }
  }


}
