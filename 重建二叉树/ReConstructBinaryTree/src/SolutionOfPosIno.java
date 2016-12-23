/**
 * Created by Administator on 2016/12/23.
 * 输入后序序列 pos 和中序序列 ino
 */
public class SolutionOfPosIno {
    public TreeNode reConstructBinaryTree(int[] pos, int[] ino) {
        return helper(pos, 0, pos.length - 1, ino, 0, ino.length - 1);
    }
    public TreeNode helper(int[] pos, int posbegin, int posend,
                           int[] ino, int inobegin, int inoend) {
        if (posbegin > posend)
            return null;
        TreeNode root = new TreeNode(pos[posend]);
        if (posbegin == posend)
            return root;
        int index = 0;
        while (pos[posend] != ino[index++]);
        index--;
        int llen =index - inobegin;
        root.left = helper(pos, posbegin, posbegin + llen -1, ino, inobegin, index - 1);
        root.right = helper(pos, posbegin + llen, posend, ino, index + 1, inoend);
        return root;
    }
}
