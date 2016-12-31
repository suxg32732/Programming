/**
 * Created by xg on 2016/12/31.
 */
public class Solution {
    public static int thirdMax(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        int[] max = new int[3];
        int count = 0;
        boolean isIntmin = false;
        max[0] = max[1] = max[2] = Integer.MIN_VALUE;
        for (int i : nums) {
            if(i == Integer.MIN_VALUE) isIntmin = true;

            if (i == max[0] || i == max[1] || i == max[2])
                continue;
            if (i > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = i;
                count++;
            }else if (i > max[1]) {
                max[2] = max[1];
                max[1] = i;
                count++;
            }else if (i > max[2]) {
                max[2] = i;
                count++;
            }
        }
        /**/
        if (isIntmin) {
            if (count < 2) return max[0];
            else return Integer.MIN_VALUE;
        }
        return count > 2 ? max[2] : max[0];
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,};
        System.out.print(thirdMax(nums));
    }
}
