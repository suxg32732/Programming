/**
 * Created by Administator on 2016/12/6.
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length <= 1)
            return true;
        int index = sequence.length - 1;
        while (index >= 0 && sequence[index] > sequence[sequence.length - 1])
            index--;

    }
}
