import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administator on 2016/12/29.
 */
public class Solution {
    public int majorityElement(int[] nums) {
 //使用Map  O(n)
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            //int val = map.getOrDefault(i, 0) + 1;
            map.put(num, map.getOrDefault(nums, 0) + 1);
            if (map.get(num) * 2 > nums.length)
                return num;
        }
        return 0;
    }
    public int majorityElement2(int[] nums) {
//        直接对数组排序，由于主元素的出现次数大于 n/2,            nlog(n)
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    public int majorityElement3(int[] nums) {
//        Moor Voting
        int count = 0, major  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count++;
            } else if (nums[i] == major)
                count++;
            else
                count--;
        }
        return major;
    }
}
