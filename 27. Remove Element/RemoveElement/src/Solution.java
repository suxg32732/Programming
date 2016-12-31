import java.util.Arrays;

/**
 * Created by xg on 2016/12/31.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int index = 0;
        int count;
        while (nums[index] <= val) {
            if (nums[index] == val) count++;
        }
        for (int i = 0; i < nums.length; i++) {
            if ()
        }
        return nums.length- count;
    }
}

