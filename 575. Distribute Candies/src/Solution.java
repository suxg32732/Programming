import java.util.HashSet;

public class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : candies) {
            set.add(i);
        }
//        int halfLength = candies.length / 2;
//        return set.size() > halfLength ? halfLength : set.size();
        return Math.min(set.size(), candies.length / 2);
    }
}