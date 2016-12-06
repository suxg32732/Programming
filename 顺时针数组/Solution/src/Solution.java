/**
 * Created by Administator on 2016/12/6.
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> printMatrix(int [][] m) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
//        int i = 0;
//        int	j = 0;
        int right = m[0].length - 1,
                left = 0,
                top = 0,
                end = m.length - 1;
        if(m.length == 0)
            return null;
        int layer = (right+2) / 2;
        while(left <= right && top <= end) {
            for(int i = left; i <= right; i++)
                arr.add(m[top][i]);
            for (int i = top + 1; i <= end; i++)
                arr.add(m[i][right]);
            if (top != end) {
                for (int i = right - 1; i >= left; i--)
                    arr.add(m[end][i]);
            }
            if (left != right) {
                for (int i = end -1; i > top; i--)
                    arr.add(m[i][left]);
            }
            right--; left++; top++; end--;
            layer--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int[][] b ={{1,2,3},{1,2,3},{1,2,3}};
        int[][] c= {{1,2,3,4}};
        int[][] d={{1},{2},{3},{4}};
        System.out.println(printMatrix(a));
    }
}
