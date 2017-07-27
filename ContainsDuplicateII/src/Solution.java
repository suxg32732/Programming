import java.util.Scanner;

/**
 * Created by xg on 2017/1/4.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) break;
            int total = 0;
            for (int i = 0; i < num; i++)
                total += sc.nextInt();
            int len = total - 1;
            while(total % len != 0)
                len--;
            System.out.print(len);

        }


    }

}
