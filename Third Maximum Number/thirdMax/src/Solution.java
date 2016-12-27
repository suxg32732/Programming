/**
 * Created by xg on 2016/12/26.
 */
public class Solution {
    public static int thirdMax(int[] nums) {
        int[] res = new int[3];
        res[0] = res[1] = res[2] = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > res[0]) {
                res[2] = res[1];
                res[1] = res[0];
                res[0] = nums[i];
                count++;
            } else if ( nums[i] == res[0]) {
                continue;
            } else if(nums[i] > res[1]) {
                res[2] = res[1];
                res[1] = nums[i];
                count++;
            } else if (nums[i] == res[1]) {
                continue;
            } else if(nums[i] >= res[2]) {
                res[2] = nums[i];
                count++;
            }
        }
        if(count >= 3)
            return res[2];
        else return res[0];
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.print(thirdMax(nums));
    }
}
