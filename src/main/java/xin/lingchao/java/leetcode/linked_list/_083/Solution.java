package xin.lingchao.java.leetcode.linked_list._083;

import xin.lingchao.java.leetcode.structure.ListNode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * <p>
 * <b>示例 1:</b>
 *
 * <pre>
 * 输入: 1-&gt;1-&gt;2
 * </pre>
 *
 * <p>
 * <b>示例 2:</b>
 *
 * <pre>
 * 输入: 1-&gt;1-&gt;2-&gt;3-&gt;3
 * 输出: 1-&gt;2-&gt;3
 * </pre>
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/}
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
