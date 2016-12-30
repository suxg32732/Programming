/**
 * Created by xg on 2016/12/29.
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder stb = new StringBuilder();
        int carry = 0;
        int i = 0;
        for(; ) {
            int n = num1.charAt(i) + num2.charAt(i) - 2 * '0' + carry;
            carry = n / 10;
            stb = n + stb;
        }
        if(i > num1.length())
            return i > num1.length() ? num2.substring(i) + stb.toString() :
                    num1.substring(i) + stb.toString();
    }
}
