/**
 * Created by Administator on 2016/12/15.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class StrCmp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (o1 + o2).compareTo(o2 + o1);
    }
}
public  class Solution {
    public static String PrintMinNumber(int [] numbers) {
        if (numbers == null)
            return null;
        ArrayList<String> ls = new ArrayList<String>();
        for (int i : numbers) {
            ls.add(String.valueOf(i));
        }
        ls.sort(new StrCmp());
//        ls.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o1 + o2).compareTo(o2 + o1);
//            }
//        });

//        Collections.sort(ls, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return (o1 + o2).compareTo(o2 + o1);
//            }
//        });
        String res = "";
        for (String i : ls) {
            res += i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] n = {8,87};
        System.out.print(PrintMinNumber(n));
    }
}