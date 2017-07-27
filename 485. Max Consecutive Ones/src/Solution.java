import org.junit.Test;

public class Solution {
  public static int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      while (i < nums.length && 1 == nums[i]) {
        count++;
        i++;
      }
      maxCount = maxCount >= count ? maxCount : count;
    }
    return maxCount;
  }

  int method2(int[] nums) {
    int maxHere = 0, max = 0;
    for (int n : nums)
      max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
    return max;
  }

  public static void main(String[] args) {
    int[] n = {1,1,1,1,0,0,0,1,1,1,};
    System.out.println(findMaxConsecutiveOnes(n));
  }
}