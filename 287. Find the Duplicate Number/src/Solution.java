public class Solution {
  public static int findDuplicate(int[] nums) {
    int dup = 0;
    int pre = 0;
    for (int i : nums) {
      pre = dup;
      dup ^= i;
      if (pre == dup)
        return i;
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,4,5,6,1};
    System.out.println(findDuplicate(nums));
  }
}