import java.util.Arrays;

/**
 * Created by Administator on 2016/12/7.
 * 新的丑数总是从已有的丑数中 *2 *3 *5得到，分别用t2 t3 t5表示
 * 如果队列中某个数刚好产生新的丑数，那么可以把他的下标下移以为，因为如果他能产生的丑数不会大于已有的丑数
 *
 */
public class Solution {
    public static int GetUglyNumber_Solution(int index) {
        if (index <= 0)
            return 0;
        int[] ugly = new int[index];
        ugly[0] = 1;
        int i = 0;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        while (i < index -1) {
            int val = min(ugly[t2] * 2, ugly[t3] * 3, ugly[t5] * 5);
            if (val == ugly[t2] * 2) t2++;
            if (val == ugly[t3] * 3) t3++;
            if (val == ugly[t5] * 5) t5++;
            ugly[++i] = val;
        }
        return ugly[i];
    }
    public static int min(int a, int b, int c) {
        int tmp = a < b ? a : b;
        return tmp < c ? tmp : c;
    }
    public static void main(String[] args) {
        int num = GetUglyNumber_Solution(1000);
        System.out.print(num);
    }
}
