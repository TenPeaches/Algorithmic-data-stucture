package com.krahets.linked_list.leetcode237;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method01 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
