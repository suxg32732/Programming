import java.util.HashMap;
import java.util.StringJoiner;

/**
 * Created by Administator on 2016/12/6.
 */
public class Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i : array) {
           m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
           if (m.get(i) * 2 > array.length)
               return i;
        }
        return 0;
    }
    public static void  main(String[] args) {
        int[] a= {1,2,3,2,2,2,5,4,2};
        System.out.print(MoreThanHalfNum_Solution(a));
    }
}
