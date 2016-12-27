/**
 * Created by Administator on 2016/12/27.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        String str = Integer.toBinaryString(x ^ y);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.print(Integer.bitCount(7));
    }

}
