/**
 * Created by Administator on 2016/12/8.
 */
public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n <= 0)
            return 0;
        int[] sugly = new int[n];
        int[] index = new int[primes.length];
        sugly[0] = 1;
        int count = 0;
        while (count < n - 1) {
            int val = Integer.MAX_VALUE;
            for (int i = 0; i < primes.length; i++) { //求出最小值；
                if (sugly[index[i]] * primes[i] < val) {
                    val = sugly[index[i]] * primes[i];
                }
            }
            for (int i = 0; i < primes.length; i++) { //后移；
                if (sugly[index[i]] * primes[i] == val) {
                    index[i]++;
                }
            }
            sugly[++count] = val;
        }
        return sugly[count];
    }
}
