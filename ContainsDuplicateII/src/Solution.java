/**
 * Created by xg on 2017/1/4.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k > nums.length)
            return false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + k])
                return true;
        }
        return false;
    }
}
