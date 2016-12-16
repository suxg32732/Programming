import java.util.Arrays;

/**
 * Created by xg on 2016/12/9.
 */
public class OnlyOneSolution {
    public static int[] twoSum(int[] array, int sum) {
        int[] res = new int[2];
        if (array == null || array.length < 2)
            return res;
        int i = 0;
        int j = array.length -1;
        while(i < j) {
            int tmp = array[i] + array[j];
            if(tmp == sum) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            } else if (tmp < sum) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
    public static  void  main(String[] args) {
        int[] a= {2,3,4};
        System.out.print(Arrays.toString(twoSum(a,6)));
    }
}
