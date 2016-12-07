/**
 * Created by Administator on 2016/12/6.
 */
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode ln = new RandomListNode();
        if (pHead == null)
            return ln;
        while (pHead != null) {
            ln = pHead;
        }
    }
}
