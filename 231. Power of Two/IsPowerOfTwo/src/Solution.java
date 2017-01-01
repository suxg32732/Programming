/**
 * Created by xg on 2017/1/1.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return  n > 0 && Math.pow(2, 30) % n == 0;
    }
    public boolean method2(int n) {
        if (n < 1) return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }
        return true;
    }
    public boolean method3(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        return n % 2 == 0 &&method3(n / 2);
    }
    public static void main(String[] args) {
        System.out.print(Math.pow(2, 30) > Integer.MAX_VALUE);
    }
}
