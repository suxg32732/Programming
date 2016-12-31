/**
 * Created by Administator on 2016/12/30.
 */
public class Solution {
    public static String addStrings(String num1, String num2) {
        StringBuilder stb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() -1, j= num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            stb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return stb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.print(addStrings("123", "923"));
    }
}