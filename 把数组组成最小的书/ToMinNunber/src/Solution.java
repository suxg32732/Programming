/**
 * Created by Administator on 2016/12/15.
 */
import java.util.ArrayList;

public  class Solution {
    public static String PrintMinNumber(int [] numbers) {
        if (numbers == null)
            return null;
        ArrayList<String> ls = new ArrayList<String>();
        for (int i : numbers) {
            ls.add(String.valueOf(i));
        }
        ls.sort(new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0; i < o1.length() && i < o2.length(); i++) {
                    if (o1.charAt(i) > o2.charAt(i))
                        return 1;
                    if (o1.charAt(i) < o2.charAt(i))
                        return -1;
                }
                if (o1.length() == o2.length())
                    return 0;
                else if (o1.length() > o2.length())
                    return -1;
                return 1;
            }
        });
        String res = "";
        for (String i : ls) {
            res += i;
        }
        return res;
//        return ls;
    }
    public static void main(String[] args) {
        int[] n = {3,32,321,0};
        System.out.print(PrintMinNumber(n));
    }
}