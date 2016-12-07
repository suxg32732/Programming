import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administator on 2016/12/7.
 */
public class Solution {
    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0)
            return -1;
        StringBuilder stb = new StringBuilder(str);
        for (int i = 0; i < stb.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < stb.length(); ) {
                if (stb.charAt(j) == stb.charAt(i)) {
                    count++;
                    stb.deleteCharAt(j);
                    continue;
                }
                j++;
            }
            if (count == 0)
                return str.indexOf(stb.charAt(i));
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "dasdasdafs";
        System.out.print(FirstNotRepeatingChar(s));
    }
}
