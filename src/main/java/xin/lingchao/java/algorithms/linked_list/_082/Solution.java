package xin.lingchao.java.algorithms.linked_list._082;

import xin.lingchao.java.structure.ListNode;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * <p>
 *
 * <b>示例 1:</b>
 *
 * <pre>
 * 输入: 1-&gt;2-&gt;3-&gt;3-&gt;4-&gt;4-&gt;5
 * 输出: 1-&gt;2-&gt;5
 * </pre>
 * <p>
 * <b>示例 2:</b>
 *
 * <pre>
 * 输入: 1-&gt;1-&gt;1-&gt;2-&gt;3
 * 输出: 2-&gt;3
 * </pre>
 *
 * <p>
 *
 * {@link https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/}
 */
class Solution {
    /**
     * Solution:
     * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/discuss/28364/Java-simple-and-clean-code-with-comment}
     **/
    public ListNode deleteDuplicates(ListNode head) {
        // 使用双指针, slow 指针跟踪重复前的节点; fast 指针查找重复节点的最后一个.
        ListNode dummy = new ListNode(0);
        ListNode fast = head;
        ListNode slow = dummy;
        slow.next = fast;

        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next; // loop 查找重复的最后一个节点
            }

            if (slow.next != fast) { // 检测到重复
                slow.next = fast.next; // 移除重复
                fast = slow.next; // 重置 fast 指针
            } else { // 无重复, 同时移动两个指针
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}
