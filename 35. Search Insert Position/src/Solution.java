public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
       return nums.length;
    }
    int method(int[] nums, int target) {
        if (nums[0] >= target) return 0;
        if (nums[nums.length - 1] < target) return nums.length;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}