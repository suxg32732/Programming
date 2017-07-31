import java.util.Arrays;

public class Solution {
  public static int removeElement(int[] nums, int val) {
    int star = 0, end = nums.length -1;
    while (star <= end) {
      while (star < nums.length && nums[star] != val) star++;//从左到右start为val
      while (end >= 0 && nums[end] == val) end--;//从右到左end为非val
      if (star < end) {
        int tmp = nums[star];
        nums[star] = nums[end];
        nums[end] = tmp;
        star++;
        end--;
      }
    }
    return end + 1;
  }

  public static int[] method2(int[] nums, int val) {
    int len= nums.length;
    int j= len-1;
    for (int i=0; i<= j; i++){
      while ( j>=i && nums[i]== val) {
        nums[i]=nums[j--];
      }
    }
    return nums;
  }
  int method3(int[] nums, int val) {
    int star = 0, end = nums.length -1;
    while (star <= end) {
      while ( star <= end && nums[star] == val)
        nums[star] = nums[end--];
      star++;
    }
    return end + 1;
  }

  public static void main(String[] args) {
    int[] nums = {3,2,2,3};
//    System.out.println(removeElement(nums, 2));
    System.out.println(Arrays.toString(method2(nums, 2)));
  }
}