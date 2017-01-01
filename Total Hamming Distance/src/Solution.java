/**
 * Created by xg on 2017/1/1.
 * 求出所有组合的距离相加就得到结果,每个数由32bit组成
 * 每两个数 XY的距离 = b0 + b1 +  ^ + b31 (bi ==1 当两个数的该位不同时， 否则为0)
 * 总的距离 = XY + …… +
 *          = B0 + …… + B31
 *         B0 为数组元素所有该位置不同的组合，即求出每一位不同的组合数就可以实现
 */
public class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int num : nums)
                bitCount += (num >> i) & 1;// num & (1 <<< i)
            res += bitCount * (nums.length -bitCount);
        }
        return res;
    }
}
