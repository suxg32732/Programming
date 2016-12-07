import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administator on 2016/12/7.
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length == 0) {
            num1[0] = 0;
            num2[0] = 0;
        }
        List<Integer> ls = new LinkedList<Integer>();
        for (int i : array) {
            if (ls.contains(i))
                ls.remove(Integer.valueOf(i));
            else
                ls.add(Integer.valueOf(i));
        }
        num1[0] = ls.get(0);
        num2[0] = ls.get(1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        int[] b = new int[1];
        int[] c = new int[1];
        FindNumsAppearOnce(a,b,c);
    }
}
