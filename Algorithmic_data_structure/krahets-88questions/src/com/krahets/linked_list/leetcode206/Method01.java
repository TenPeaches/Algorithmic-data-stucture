package com.krahets.linked_list.leetcode206;

import com.krahets.linked_list.leetcode21.ListNode;

public class Method01 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
