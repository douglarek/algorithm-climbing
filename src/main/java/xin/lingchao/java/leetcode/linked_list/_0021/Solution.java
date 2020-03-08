package xin.lingchao.java.leetcode.linked_list._0021;

import xin.lingchao.java.leetcode.structure.ListNode;

/**
 *
 *将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * <b>示例：</b>
 *
 * <pre>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * </pre>
 *
 * <p>
 *
 * <b>时间复杂度: </b>O(m+n)
 * <p>
 * <b>空间复杂度: </b>O(1).
 *
 * See <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">https://leetcode-cn.com/problems/merge-two-sorted-lists/</a>
 *
 * */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }

            head = head.next;
        }

        head.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
