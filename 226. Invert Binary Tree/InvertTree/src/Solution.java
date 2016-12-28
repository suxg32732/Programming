import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Administator on 2016/12/28.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
//        TreeNode temp  = root.left;
//        root.left = root.right;
//        root.right = temp;
//        invertTree(root.left);
//        invertTree(root.right);
        Queue<TreeNode> ls = new LinkedList<TreeNode>();
        ls.add(root);
        while (!ls.isEmpty()) {
            TreeNode node = ls.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) ls.add(node.left);
            if (node.left != null) ls.add(node.right);
        }
        return root;
    }
}
