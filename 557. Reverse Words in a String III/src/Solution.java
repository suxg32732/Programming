public class Solution {
<<<<<<< HEAD
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
=======
    public static  String reverseWords(String s) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < s.length();) {
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ')
                j++;
            for(; j - 1 >= i; j--) {
                stb.append(s.charAt(j-1));
            }
            stb.append(' ');
            i = stb.length();
        }


        return stb.toString().trim();
    }

    public String method2(String s) {
        StringBuilder stb = new StringBuilder();
        for (String ss : s.split(" ")) {
            stb.append(' ').append(new StringBuilder(ss).reverse());
        }
        return stb.toString().trim();
    }

    public static void main(String[] args) {
        String string = "Let's make";
//        System.out.println(" he ".trim());
        System.out.println(reverseWords(string));
>>>>>>> origin/Coding
    }
}