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

    /**
     * 递归版
     *
     */
    public ListNode reverseListRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = reverseListRecursively(head.next); // 反转 head.next
        head.next.next = head; // head.next 已经反转, 那么反转 head 之前的部分只需要 head.next 的下一个指向当前 head.
        head.next = null; // 此处 head.next 必须指向 null, 否则链表可能产生循环. 使用大小为 2 的链表测试代码, 则可能会捕获此错误.

        return p;
    }

}
