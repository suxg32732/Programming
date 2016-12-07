/**
 * Created by Administator on 2016/12/6.
 */
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0)
            return 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            char[] chs =String.valueOf(i).toCharArray();
            for (char ch : chs) {
                if (ch == '1')
                    count++;
            }
        }
        return count;
    }
}
