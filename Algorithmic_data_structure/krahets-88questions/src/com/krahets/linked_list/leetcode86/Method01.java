package com.krahets.linked_list.leetcode86;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method01 {
    public ListNode partition(ListNode head, int x) {
        ListNode leftHead = new ListNode(0);
        ListNode left = leftHead;
        ListNode rightHead = new ListNode(0);
        ListNode right = rightHead;
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightHead.next;
        return leftHead.next;
    }
}
