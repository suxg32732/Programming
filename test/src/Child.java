import java.util.Arrays;

/**
 * Created by xg on 2017-06-26.
 */
public class Child extends Parent {
    String name="Child";
    public Child() {
        tell();
//        print();
    }
    public void print() {
        System.out.println("print"+name);
    }

    public static void main(String[] args) {
//        Child child = new Child();
        int[] num={1,5,6,3,4,2,9,7,8,0};
        qu(num,0,9);
        System.out.println(Arrays.toString(num));
    }
    public static void qu(int[] num, int sta, int end) {
        int i= sta;
        int j = end+1;
        if (i<j) {
            while (i < j) {
                do i++;
                while (( i <= end && num[i] < num[sta]));
                do j--;
                while ((j > 0 && num[j] > num[sta] ));
                if (i < j) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                } else {
                    break;
                }
            }
            int temp = num[j];
            num[j] = num[sta];
            num[sta] = temp;
            qu(num,sta,j - 1);
            qu(num,j+1, end);
        }

    }
}
