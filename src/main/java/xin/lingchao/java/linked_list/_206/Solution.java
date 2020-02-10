package xin.lingchao.java.linked_list._206;

/**
 * 反转一个单链表。
 * <p>
 * <b>示例:</b>
 *
 * <pre>
 * 输入: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;NULL
 * 输出: 5-&gt;4-&gt;3-&gt;2-&gt;1-&gt;NULL
 * </pre>
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/reverse-linked-list/}
 */
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
