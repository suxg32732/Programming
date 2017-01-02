import java.util.Arrays;

/**
 * Created by xg on 2017/1/1.
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       // int totallen = nums1.length + nums2.length;
        if (nums1.length == 0 && nums2.length == 0) return 0;
        else {
            nums1 = nums1.length == 0 ? nums2 : nums1;
            nums2 = nums2.length == 0 ? nums1 :nums2;
        }
//      当前两个数组都不为空
        int[] mid = new int[2];
        int x = 0, y = 0;
        for (int i = 0, j = 0; i + j <= (nums1.length + nums2.length) / 2;) {
            if (i >= nums1.length && j < nums2.length) {
                x = nums2[j];
                j++;
            } else
                x = nums1[i];
            if (j > nums2.length && i < nums1.length) {
                y = nums1[i];
                i++;
            } else
                y = nums2[j];
            mid[0] = mid[1];
            if (x > y) {
                mid[1] = y;
                j++;
            } else {
                mid[1] = x;
                i++;
            }
        }
        System.out.print(Arrays.toString(mid));
        if ((nums1.length + nums2.length) % 2 == 0)
            return (mid[0] + mid[1]) / 2.0;
        else
            return mid[1];
    }
    public static void main(String[] args) {
        int[] a={1};
        int[] b = {1,2,3};
        System.out.print(findMedianSortedArrays(a,b));
    }
}
