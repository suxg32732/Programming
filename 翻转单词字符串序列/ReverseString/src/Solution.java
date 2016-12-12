import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Administator on 2016/12/12.
 */
public class Solution {
    public static String ReverseSentence(String str) {
        if(str == null || str.length() == 0)
            return str;
        String res = "";
//        String[] strs = str.split(" ");
//        for (String i : strs) {
//            res = i + " " +res;
//        }
        for (int i = 0; i < str.length();) {
            String tmp = "";//读取单词
            while (i < str.length() - 1 && ' ' != str.charAt(i)) {
                tmp += str.charAt(i++);
            }
            tmp = str.charAt(i) == ' ' ? str.charAt(i++) + tmp : tmp + str.charAt(i++);
            res = tmp + res;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "i am a student.";
//        String str ="a d";
        System.out.print(ReverseSentence(str));
    }
}