import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administator on 2017/1/5.
 */
public class Solution {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<Integer>();
        int[] pchs = new int[26];
        for (int i = 0; i < p.length(); i++)
            pchs[p.charAt(i) - 'a']++;
        for (int i = 0; i + p.length() <= s.length();i++) {
            int[] temp = new int[26];
            for (int j = 0; 0 != pchs[s.charAt(i + j) - 'a'] && j  < p.length(); j++)
                temp[s.charAt(i + j) - 'a']++;
            if (Arrays.equals(temp, pchs))
                ls.add(i);
        }
        return ls;
    }
    public static void main(String[] args) {
        System.out.print(findAnagrams("abab","ab"));
    }
}
