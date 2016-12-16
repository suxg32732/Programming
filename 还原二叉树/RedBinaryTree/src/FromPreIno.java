/**
 * Created by xg on 2016/12/8.
 */
public class FromPreIno {
    public TreeNode Solution(int[] pre, int[] ino) {
        if (pre == null || ino == null || pre.length ==0 || ino.length == 0)
            return null;
        if (ino.length == 1)
            return new TreeNode(pre[0]);
        TreeNode head = new TreeNode(pre[0]);
        int index = 0;
        while (ino[index++] != pre[0]); //寻找根节点所在位置
        if (index >= 2) { // 还原左子树
            int[] leftpre = new int[index - 1];
            int[] leftino = new int[index - 1];
            System.arraycopy(pre, 1, leftpre, 0, index - 1);
            System.arraycopy(ino, 0, leftino, 0, index - 1);
            head.left = Solution(leftpre, leftino);
        } else {
            head.left = null;
        }
        if (ino.length - index > 0) {//还原右子树
            int[] rightpre = new int[index - 1];
            int[] rightino = new int[index - 1];
            System.arraycopy(pre, index, rightpre, 0, index - 1);
            System.arraycopy(ino, index, rightino, 0, index - 1);
            head.left = Solution(rightpre, rightino);
        } else {
            head.right = null;
        }
        return null;
    }
    public void bulidHelper(int rootindex, int[] pre, int prebeg, int preend, int[] ino ,int inobeg, int inoend) {
        TreeNode head = new TreeNode(pre[0]);
        if () {
            head.left = bulidHelper(1, pre, );
            head.right = bulidHelper();
        }
    }
}
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}
