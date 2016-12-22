/**
 * Created by Administator on 2016/12/22.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class SolutionOfPreIno {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] ino) {

        if (pre.length == 0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        if (pre.length == 1)
            return root;
        int index = 0;
        while (ino[index++] != pre[0]);
        index--;//寻找左右子树分界线,index为根节点位置

        int len = pre.length;
        int[] lpre = new int[index];//左子树前序
        int[] lino = new int[index];//左子树中序
        int[] rpre = new int[len - index - 1];//右子树前序
        int[] rino = new int[len - index - 1];//右子树中序

        System.arraycopy(pre, 1, lpre, 0, index);
        System.arraycopy(ino, 0, lino, 0, index);
        System.arraycopy(pre, index+1, rpre, 0, len-index-1);
        System.arraycopy(ino, index+1, rino, 0, len-index-1);

        root.left = reConstructBinaryTree(lpre, lino);
        root.right = reConstructBinaryTree(rpre, rino);
        return root;
    }
    public static void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }
    public static void main(String[] args) {
        int[] pre = {1,2,4,3,5,6};
        int[] ino = {4,2,1,5,3,6};
        printTree(reConstructBinaryTree(pre, ino));
    }
}
