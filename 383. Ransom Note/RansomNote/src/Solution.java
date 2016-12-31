/**
 * Created by xg on 2016/12/31.
 */
public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) array1[ransomNote.charAt(i) - 'a']++;
        for (int i = 0; i < magazine.length(); i++) array2[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 0 && array1[i] > array2[i])
                return false;
        }
        return true;
    }
    public boolean method2(String ransomNote, String magazine) {
        int[] array = new int[26];
        for (int i = 0; i < magazine.length(); i++)
            array[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--array[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print(canConstruct("bjaajgea",
                "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"));
    }
}
