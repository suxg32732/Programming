public class Solution {
  public int missingNumber(int[] nums) {
    int res = nums.length;
    for (int i = 0; i < nums.length; i++) {
      res ^= i;
      res ^= nums[i];
    }
    return res;
  }
  int method(int[] nums) {
    int res = 0;
    for (int i : nums) {
      res += i;
    }
    return (0 + nums.length) * (nums.length + 1) / 2 - res;
  }
}