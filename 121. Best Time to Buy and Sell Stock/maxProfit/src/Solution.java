import java.util.HashMap;

/**
 * Created by Administator on 2016/12/30.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit= Math.max(profit, prices[i] - min);
        }
        return profit;
    }
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = 0;
        int ;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + )
        }
    }
}
