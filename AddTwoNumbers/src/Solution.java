///**
// * Created by xg on 2017-07-24.
// */
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//public class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode head = l1;
//        while (l1 != null && l2 != null) {
//            if (l1 == null) {
//                i = 0;
//            }
//            if (l2 == null) {
//
//            }
//            int i  = l1 == null ? 0 : l1.val;
//            int j  = l2 == null ? 0 : l2.val;
//            int temp = j + i + carry;
//            l1.val =  temp % 10;
//            carry = temp/ 10;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        if (l2.next == null) {
//
//        }
//
//    }
//}