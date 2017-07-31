import java.util.Arrays;

/**
 * 要使结果最大，需为正数，有正*正*正和负*负*正两种情况，只需找出最小的两个数和最大的三个数即可。
 */
public class Solution {
  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int end = nums.length - 1;
    return Math.max(nums[0] * nums[1] * nums[end], nums[end] * nums[end - 1] * nums[end - 2]);
  }
  int method(int[] nums) {
    int max1 = Integer.MIN_VALUE,
        max2 = Integer.MIN_VALUE,
        max3 = Integer.MIN_VALUE,
        min1 = Integer.MAX_VALUE,
        min2 = Integer.MAX_VALUE;

    for (int i : nums) {
      if (i > max1) {
        max3 = max2;
        max2 = max1;
        max1 = i;
      } else if (i > max2) {
        max3 = max2;
        max2 = i;
      } else if (i > max3) {
        max3 = i;
      }
      if (i < min1) {
        min2 = min1;
        min1 = i;
      } else if (i < min2) {
        min2 = i;
      }
    }
    return Math.max(max1 * max2 * max3, max1 * min1 * min2);
  }
}