/**
 * Created by Administator on 2016/12/28.
 */
public class Solution {
    public static int countSegments(String s) {
        int res = 0;
//        String[] strs = s.split(" ");
//        for (String str : strs){
//            if (!str.equals(""))
//                res++;
//        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res++;
                while (i < s.length() && s.charAt(i) != ' ') i++;
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        System.out.print(countSegments( "Hello, my name is John"));
    }
}
