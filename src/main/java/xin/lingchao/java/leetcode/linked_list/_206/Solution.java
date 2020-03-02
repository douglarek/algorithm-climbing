package xin.lingchao.java.leetcode.linked_list._206;

import xin.lingchao.java.leetcode.structure.ListNode;

/**
 * 反转一个单链表。
 * <p>
 * <b>示例:</b>
 *
 * <pre>
 * {@code
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * }
 * </pre>
 *
 * <p>
 *
 * <b>进阶:</b> 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * <p>
 * See <a href=
 * "https://leetcode-cn.com/problems/reverse-linked-list/">https://leetcode-cn.com/problems/reverse-linked-list/</a>
 */
class Solution {
    /*
     * 假设现在有 1->2->3
     *
     * 1) 1->pre, pre=1; 2) 2->pre 即 2->1, pre=2, 即 pre=2->1; 3) 3->pre 即3->2->1, pre=3, 即
     * pre=3->2->1
     *
     */
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
