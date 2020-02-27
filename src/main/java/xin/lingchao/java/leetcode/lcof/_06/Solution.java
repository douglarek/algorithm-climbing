package xin.lingchao.java.leetcode.lcof._06;

import java.util.ArrayDeque;
import java.util.Deque;

import xin.lingchao.java.leetcode.structure.ListNode;

/**
 *
 * 面试题06: 从尾到头打印链表
 * <p>
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * 示例 1：
 *
 * <pre>
 * {@code
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * }
 * </pre>
 *
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/</a>
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        // ListNode curr = head;
        // List<Integer> res = new ArrayList<>();
        // while (curr != null) {
        // res.add(curr.val);
        // curr = curr.next;
        // }

        // Collections.reverse(res);
        // return res.stream().mapToInt(Integer::intValue).toArray();
        ListNode curr = head;

        Deque<Integer> stack = new ArrayDeque<>(); // Stack<Integer> stack = new Stack<>();
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
