package xin.lingchao.java.linked_list._203;

import xin.lingchao.java.structure.ListNode;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * <b>示例:</b>
 *
 * <pre>
 * 输入: 1-&gt;2-&gt;6-&gt;3-&gt;4-&gt;5-&gt;6, val = 6
 * 输出: 1-&gt;2-&gt;3-&gt;4-&gt;5
 * </pre>
 *
 * <p>
 *
 * {@link https://leetcode-cn.com/problems/remove-linked-list-elements/}
 *
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0); // 哨兵节点被用于伪头
        dummy.next = head;
        ListNode curr = head;
        ListNode pre = dummy;

        while (curr != null) {
            if (curr.val == val) {
                pre.next = curr.next;
            } else {
                pre = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public ListNode removeElementsRecursively(ListNode head, int val) {
        if (head == null)
            return null;
        head.next = removeElementsRecursively(head.next, val);
        if (head.val == val)
            return head.next;
        return head;
    }
}
