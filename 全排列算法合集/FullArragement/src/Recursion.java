import java.util.Arrays;

/**
 * Created by Administator on 2016/12/12.
 */
public class Recursion {
    public static void arrange(int[] nums, int begin, int end) {
        if (begin == end) {
            System.out.println(Arrays.toString(nums));
        } else {
            for (int i = begin; i <= end; i++) {
                swap(nums, begin, i);
                arrange(nums, begin+1, end);
                swap(nums, begin, i);
            }
        }
    }
    public static void swap(int[] nums, int m, int n) {
        if (n != m) {
            int tmp = nums[m];
            nums[m] = nums[n];
            nums[n] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        arrange(nums, 0, 8);
    }
}
