/**
 * Created by Administator on 2016/12/22.
 */
import java.util.*;

public class Reverse {
    public String reverseString(String iniString) {
        // write code here
//        return new StringBuffer(iniString).reverse().toString();
        StringBuilder stb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();
        for (int i = iniString.length() - 1; i >= 0; i--) {
//            stb.append(iniString.charAt(i));
            sbf.append(iniString.charAt(i));
        }
        return stb.toString();
    }
}
