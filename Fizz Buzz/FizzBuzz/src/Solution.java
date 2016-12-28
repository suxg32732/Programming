import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administator on 2016/12/28.
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if( i % 15 == 0)
                res.add("FizzBuzz");
            else if (i % 3 == 0)
                res.add("Fizz");
            else if (i % 5 == 0)
                res.add("Buzz");
            else res.add("" + i);
        }
        return res;
    }
}
