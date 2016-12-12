/**
 * Created by Administator on 2016/12/12.
 */
public class Solution {
    public static String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0 )
            return str;
//        str = str.substring(n)+str.substring(0,n);
//        return str;
        int len = str.length();
        n %= len;
        str += str;
        return str.substring(n, len + n);
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.print(LeftRotateString(str,10));
    }
}