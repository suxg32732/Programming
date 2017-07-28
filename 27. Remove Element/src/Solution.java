public class Solution {
  public static int removeElement(int[] nums, int val) {
    int star = 0, end = nums.length -1;
    int count = 0;
    while (star != nums.length) {
      while (star < nums.length && nums[star] != val) {
        star++;
      }
      while (end >= 0 &&nums[end] == val) end--;
      { int tmp = nums[star];
        nums[star] = nums[end];
        nums[end] = tmp;
        count++;
      }
      star++;
      end--;
    }
    return nums.length - count;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,5,56};
    System.out.println(removeElement(nums, 5));
  }
}