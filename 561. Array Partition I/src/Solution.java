import java.util.Arrays;
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length;){
            res += nums[i];
            i += 2;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 4;
        int b= -~a;
        int c = b << 1;
        int d = c >> 1;
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
//public class Solution {
//    public int[][] matrixReshape(int[][] nums, int r, int c) {
//        if (nums.length * nums[0].length != r * c)
//            return nums;
//        int[] temp = new int[nums.length * nums[0].length];
//        int[][] res = new int[r][c];
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++){
//                temp[k++] = nums[i][j];
//            }
//        }
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++){
//                res[i][j] = temp[i*c+j];
//            }
//        }
//        return res;
//    }
//}