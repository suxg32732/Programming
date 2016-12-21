import java.util.HashMap;
import java.util.Set;

/**
 * Created by Administator on 2016/12/21.
 */
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        //找到第一个不重复的点
        while (pHead.next != null) {
            if (pHead.val != pHead.next.val) {
                break;
            }
            pHead = pHead.next.next;
        }
        if (pHead.next == null)
            return pHead;
        ListNode former = pHead;
        ListNode temp = pHead.next;
        while (temp.next != null) {
            if (temp.val != temp.next.val) {
                former.next = temp;
                former = temp;
            }
            temp = temp.next;
        }
        return pHead;
//        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
//        ListNode ls = pHead;
//        while (ls != null) {
//            int value = map.getOrDefault((ListNode)ls);
//            map.put(ls,value == 0 ? 1 : value + 1 );
//            ls = ls.next;
//        }
//        ls = pHead;
//        ListNode next = pHead;
//        while (next != null) {
//            if (map.get((ListNode)next) == 1) {
//                ls.next = next;
//                ls = next;
//            } else {
//                next = next.next;
//            }
//
//        }

    }
}
