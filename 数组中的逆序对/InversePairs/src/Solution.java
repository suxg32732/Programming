/**
 * Created by Administator on 2016/12/16.
 */
public class Solution {
    public int InversePairs(int [] array) {
        if (array == null)
            return 0;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    res++;
            }
        }
        return res % 1000000007;
    }
}
