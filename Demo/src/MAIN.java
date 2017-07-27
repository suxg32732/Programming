import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xg on 2017/4/16.
 */
public class MAIN {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("da");
        ls.add("a");
        ls.add("da");
        Iterator it = ls.iterator();
        while(it.hasNext()) {
            System.out.print(it.next());
            if (it.next().equals("da"))
                it.remove();

        }
    }

}
