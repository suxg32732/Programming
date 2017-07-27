public class Solution {
    public static String reverseWords(String s) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < s.length();) {
            if (s.charAt(i) == ' ') {
                stb.append(' ');
                i++;
            }
            int j = i;
            while(s.charAt(j) != ' ' && j < s.length()) j++;
            int k = j;
            for (;j - 1 >= i; j--)
                stb.append(s.charAt(j-1));
            stb.append(' ');
            i=k;
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        String str = "let's do it";
        System.out.println(reverseWords(str));
    }
}