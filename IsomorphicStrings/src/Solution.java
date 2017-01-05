import java.util.HashMap;
import java.util.Objects;

/**
 * Created by xg on 2017/1/4.
 */
public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) ) {//key没有被使用过

                if (map.values().contains(t.charAt(i)))//Key没有被使用，但是Value已经被使用了
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            } else if (map.get(s.charAt(i)) != t.charAt(i))//Key被使用过，检查Value是否相等
                return false;
            if (!Objects.equals(map.put(s.charAt(i), t.charAt(i)), map.put(t.charAt(i), s.charAt(i))))
                return false;
        }
        return true;
    }
    public boolean method2(String s, String t) {
        int[] chs = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (chs[s.charAt(i)] == 0) {
                if (chs[t.charAt(i)] != 0)
                    return false;
                chs[s.charAt(i)] = t.charAt(i);
            } else if (chs[s.charAt(i)] != t.charAt(i))
                    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print(isIsomorphic("ba","ab"));
    }
}
