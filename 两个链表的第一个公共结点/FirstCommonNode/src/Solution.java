import java.util.ArrayList;

/**
 * Created by Administator on 2016/12/12.
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ArrayList<ListNode> ls1 = new ArrayList<ListNode>();
        while (pHead1 != null) {
            ls1.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead1 != null) {
            if (ls1.contains(pHead2))
                return pHead2;
            pHead2 = pHead2.next;
        }
        return null;
    }
}
