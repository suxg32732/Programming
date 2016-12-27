import java.util.ArrayList;
import java.util.List;

/**
 * Created by xg on 2016/12/24.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {


    }
    public void singleLever(TreeNode root, List<List<Integer>> outls) {
        ArrayList<Integer> inls = new ArrayList<Integer>();
        if (root == null)
            return ;
        inls.add(root.left.val);
        inls.add(root.rifht.val);
        singleLever(root.left);
        singleLever(root.right);
        outls.add(inls);
    }
}
