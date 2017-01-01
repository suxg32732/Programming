/**
 * Created by xg on 2017/1/1.
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        int val = (int) Math.pow(3, 19);
        return n > 0 && val % n == 0;
    }
}
