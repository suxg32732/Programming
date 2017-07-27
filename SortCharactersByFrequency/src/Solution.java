import java.util.*;

/**
 * Created by Administator on 2017/1/2.
 */
public class Solution {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        return sbf.toString();
    }
    public static void main(String[] args) {
        System.out.print(frequencySort("dasdadsdgfgfderwwew"));
    }
}
