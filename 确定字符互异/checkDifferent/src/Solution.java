/**
 * Created by Administator on 2016/12/16.
 */

public class Solution {
    public static boolean checkDifferent(String iniString) {
        // write code here
        for (int i = 0; i < iniString.length(); i++) {
            char ch = iniString.charAt(i);
            int temp = iniString.lastIndexOf(ch);
            if (i != temp)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "D-5H0F6T%Z?QM9,\72:[A8X! ;YJ#";
        System.out.print(checkDifferent(str));
    }
}
