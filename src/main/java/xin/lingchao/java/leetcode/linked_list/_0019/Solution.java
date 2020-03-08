package xin.lingchao.java.leetcode.linked_list._0019;

import xin.lingchao.java.leetcode.structure.ListNode;

/**
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * <b>示例：</b>
 *
 * <pre>
* 给定一个链表: 1->2->3->4->5, 和 n = 2.
* 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * </pre>
 *
 * <b>说明：</b> 给定的 n 保证是有效的。
 * <p>
 * <b>进阶：</b>你能尝试使用一趟扫描实现吗？
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/</a>
 *
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n + 1; i++) { // n + 1 是因为 fast 头指向了 dummy
            fast = fast.next;
        }

        while (fast != null) { // fast 领先 slow n, 所以 fast 到末尾的时候 slow 一定在导数第 n 个位置.
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next; // 因为 n 始终有效, 所以此处无必要判断为空
        return dummy.next;
    }
}
