

/**
 * Created by xg on 2017-06-26.
 */
public class Parent {
    public String name = "Parent";
    public Parent() {
        tell();
        print();
    }
    public void tell() {
        System.out.println("tell0:"+name);
    }
    public void print() {
        System.out.println("print0"+name);
    }
}
