package xin.lingchao.java.leetcode.linked_list._0141;

import xin.lingchao.java.leetcode.structure.ListNode;


/**
 *
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * <b>示例 1：</b>
 *
 * <pre>
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/linked-list-cycle/">https://leetcode-cn.com/problems/linked-list-cycle/</a>
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) { // 如果无环一定是 fast 先结束
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) { // 如果有环, fast 必定在某处和 slow 相遇
                return true;
            }
        }
        return false;
    }
}
