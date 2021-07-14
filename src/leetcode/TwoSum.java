package leetcode;

import java.util.Arrays;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(new int[]{3, 2, 4}, 6);

    for (int value : result) {
      System.out.println(value);
    }
  }

  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    //0 1 //1
    //0 2
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          break;
        }
      }
    }
    return result;
  }
}
