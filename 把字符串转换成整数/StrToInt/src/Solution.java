/**
 * Created by Administator on 2016/12/19.
 */
public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        int isPositive = 1;
        int i = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            isPositive = str.charAt(0) == '-' ? -1 : 1;
            i = 1;
        }
        int res = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                res = res * 10 + ch - '0';
            } else
                return 0;
            i++;
        }
        return res * isPositive;
    }
}
