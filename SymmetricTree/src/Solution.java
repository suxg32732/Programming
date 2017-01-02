
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xg on 2017/1/1.
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        Queue<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        while (!list.isEmpty()) {
            TreeNode leftNode = list.peek().left;
            TreeNode rightNode = list.peek().right;
            if (leftNode.val != rightNode.val)
                return false;
            if (list.poll().left.val == list.poll().)
        }
        return true;
    }
}
