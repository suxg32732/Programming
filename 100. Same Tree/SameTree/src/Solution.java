/**
 * Created by Administator on 2016/12/29.
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null || p == null) return p == q;
        return p.val == q.val & isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
    }
}