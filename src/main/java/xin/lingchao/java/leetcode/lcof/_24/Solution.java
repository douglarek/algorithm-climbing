package xin.lingchao.java.leetcode.lcof._24;

import xin.lingchao.java.leetcode.structure.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }

        return pre;
    }
}
