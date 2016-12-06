/**
 * Created by Administator on 2016/12/6.
 */
import java.util.ArrayList;
/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<TreeNode> tn = new ArrayList<TreeNode>();
        if (root == null)
            return res;
        res.add(root.val);
        tn.add(root);
        for (int i = 0; i < tn.size(); i++) {
            TreeNode tmp = tn.get(i);
            if (tmp.left != null) {
                tn.add(tmp.left);
                res.add(tmp.left.val);
            }
            if (tmp.right != null) {
                tn.add(tmp.right);
                res.add(tmp.right.val);
            }
        }
        return res;
    }
}
