import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administator on 2016/12/13.
 * 由于题目中说明数字范围在0~n-1之间,因此可以建立一个数组标记数字是否存在。
 */
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || length == 0)
            return false;
//        HashSet<Integer> set = new HashSet<Integer>();
//        for (int i : numbers) {
//            if (set.contains(i)) {
//                duplication[0] = i;
//                return true;
//            }
//        }
        boolean[] has = new boolean[length];
        for (int i : numbers) {
            if (has[i] == true) {
                duplication[0] = i;
                return true;
            }
            has[i] = true;
        }
        return false;
    }
}