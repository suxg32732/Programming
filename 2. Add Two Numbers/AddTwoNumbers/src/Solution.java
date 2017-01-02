/**
 * Created by xg on 2017/1/1.
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = l1;
        ListNode pre = l1;

        pre.val = (l1.val + l2.val) % 10;
        int carry = (l1.val + l2.val) / 10;
        l1 =l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            int x = l1 == null ? 0: l1.val;
            int y = l2 == null ? 0 : l2.val;
            int val = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            if (l1 == null) {
                l2.val = val;
                pre.next = l2;
                pre = pre.next;
                continue;
            }
            l1.val = val;
            pre.next =l1;
            pre = pre.next;
            l1 = l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        return head;
    }
    public static void main(String[] args) {
        System.out.print(9/10);
    }
}
