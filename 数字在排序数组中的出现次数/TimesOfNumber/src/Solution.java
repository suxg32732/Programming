/**
 * Created by Administator on 2016/12/12.
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if (array == null)
            return 0;
        if (k < array[0] || k > a[array.length - 1])
            return 0;
        int count = 0;
        for (int i : array) {
            if (k == i)
                count++;
            if (i > k)
                break;
        }
        return count;
    }
}
