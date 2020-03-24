package xin.lingchao.java.leetcode.linked_list.p0160;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.ListNode;

public class SolutionTest {
    @Test
    public void testGetIntersectionNode() {
        Solution s = new Solution();

        ListNode headA = ListNode.newInstance(new int[] { 5, 0, 1, 8, 4, 5 });
        ListNode headB = ListNode.newInstance(new int[] { 4, 1 });
        headB.next = headA.next.next.next; // {4,1,8,4,5}
        ListNode intersect = s.getIntersectionNode(headA, headB);
        assertArrayEquals(intersect.toArray(), new int[] { 8, 4, 5 });
    }
}
