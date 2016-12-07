import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administator on 2016/12/6.
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (input.length ==0 || input.length < k)
            return res;
        Arrays.sort(input);
        for (int i = 0; i < input.length && i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}
