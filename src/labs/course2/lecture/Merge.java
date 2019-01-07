package labs.course2.lecture;

import java.util.Scanner;

public class Merge {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }
    mergeSort(array, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
  }

  static void mergeSort(int[] array, int start, int end) {
    //arr star end 까지 합병 정렬 하는 함수
    //스타트랑 end랑 같으면 바꿀게 없데요.
    if (start >= end) {
      return;
    } else {
      //1. 왼쪽 절반 합병정렬 2. 오른쪽 절반 3. 둘을 합친다.
      int mid = (start + end) / 2;
      mergeSort(array, start, mid); // 1
      mergeSort(array, mid + 1, end); // 2
      merging(array, start, mid, mid + 1, end);
    }
  }

  static void merging(int[] array, int start1, int end1, int start2, int end2) {
    // s1 ~ e1 의 왼쪽절반, s2 ~ e2가 오른쪽 절반 일때,
    // 이 둘을 합쳐서 arr의 s1 ~ e2를 정렬된 결과를 만드는 함수
    // 1 2 4 8  3 4 6 7
    // p        q
    // temp ex) 1 2 3 4 에 저장
    int p, q;
    int[] temp = new int[100];
    int tempIndex = 0;

    p = start1;
    q = start2;
    // 1 2 4 8  2 5 7 9
    //   p        q
    while (p <= end1 && q <= end2) {
      if (array[p] <= array[q]) {
        temp[tempIndex++] = array[p];
        p++;
      } else {
        temp[tempIndex++] = array[q];
        q++;
      }
    }

    if (p > end1) {
      for (int i = q; i <= end2; i++) {
        temp[tempIndex++] = array[i];
      }
    } else {
      for (int i = p; i <= end1; i++) {
        temp[tempIndex++] = array[i];
      }
    }

    //temp는 완성 되었으니
    //array[s1~e2] 까지에 temp의 값을 복사

    for (int i = start1; i <= end2; i++) {
      //temp는 0부터 시작
      array[i] = temp[i - start1];
    }

  }
}
