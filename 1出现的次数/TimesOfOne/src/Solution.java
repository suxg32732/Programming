/**
 * Created by Administator on 2016/12/6.
 */
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0)
            return 0;
        int count = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            str.append(i);
        }
        for(int i = 0; i < str.length(); i++) {
            if (str. == '1')
                count++;
        }
        return count;
    }
}
