import java.util.HashMap;

/**
 * Created by xg on 2017/1/4.
 */
public class Solution {
    public static String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int bullsCount = 0, cowsCount = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i))
                bullsCount++;
            else
                map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
        }
        for (int i = 0; i < guess.length(); i++) {
            if (map.getOrDefault(guess.charAt(i), 0) > 0 &&
                    guess.charAt(i) != secret.charAt(i)) {
                cowsCount++;
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }
        return "" + bullsCount + "A" + cowsCount + "B";
    }
    public String method2(String secret, String guess) {
        int[] seFreq = new int[10];
        int[] guFreq = new int[10];
        int bullsCount = 0, cowsCount = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i))
                bullsCount++;
            else {
                seFreq[secret.charAt(i) - '0']++;
                guFreq[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < seFreq.length; i++) {
            if (seFreq[i] > 0)
                cowsCount += Math.min(seFreq[i], guFreq[i]);
        }

        return bullsCount + "A" + cowsCount + "B";
    }
    public static void main(String[] args) {
        System.out.print(getHint("110","101"));
    }
}
