import java.util.LinkedList;

/**
 * Created by Administator on 2017/1/5.
 */
public class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        int priCount = 0;
        int[] nums = new int[n+1];
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (nums[i] == 0) {
                priCount++;
                for (int j = 2; i * j <= n; i++)
                    nums[i*j] = 1;
            }
        }
        return priCount;
    }
}
