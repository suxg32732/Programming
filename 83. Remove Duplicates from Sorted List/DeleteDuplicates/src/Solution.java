/**
 * Created by Administator on 2016/12/30.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) //节点为空或者只有一个节点
            return head;
        ListNode root= head;
        while (head.next != null) {
            if (head.val == head.next.val)
                head.next = head.next.next;
            else head = head.next;
        }
        return root;
    }
    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        head.next = deleteDuplicates1(head.next);
        return head.val == head.next.val ? head.next : head;

    }
}
