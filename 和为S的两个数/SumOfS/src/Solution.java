/**
 * Created by xg on 2016/12/9.
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array == null || array.length < 2 || array[0] + array[array.length - 1] < sum)
            return res;
        int index1 = -1;
        int index2 = -1;
        int min = Integer.MAX_VALUE;
        int index = 0;
//        for (int i = 0; i < array.length && array[i] <= sum; i++) {
//            for (int j = i + 1; j < array.length && array[j] <= sum; j++) {
//                if (array[i] + array[j] == sum && i * j < min) {
//                    index1 = i;
//                    index2 = j;
//                    min = i * j;
//                }
//            }
//        }
        for (int i = 0; i < array.length && array[i] <= sum; i++) {
            for (int j = i + 1; j < array.length && array[j] <= sum; j++) {
                if (array[i] + array[j] == sum ) {
                    res.add(i + 1);
                    res.add(j + 1);
                    break;
                }
            }
        }
//        if (min != Integer.MAX_VALUE) {
//            res.add(index1 + 1);
//            res.add(index2 + 1);
//        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[] b= {1,2,4,7,11,16};
        System.out.print(FindNumbersWithSum(b,11));
    }
}
