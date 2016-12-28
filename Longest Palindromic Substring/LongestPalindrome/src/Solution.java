/**
 * Created by Administator on 2016/12/28.
 */
public class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        int begin = 0, end = 0;
        for (int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            int last = s.lastIndexOf(ch);
            if (maxLen < last - i + 1) {
                maxLen = last - i + 1;
                begin = i;
                end = last;
            }
        }
        int 你 = Math.max()
        return s.substring(begin, end);
    }
}
