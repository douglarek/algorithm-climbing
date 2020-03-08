package xin.lingchao.java.leetcode.linked_list._0019;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.ListNode;

public class SolutionTest {
    @Test
    public void testRemoveNthFromEnd() {
        Solution s = new Solution();
        ListNode root = s.removeNthFromEnd(ListNode.newInstance(new int[] { 1, 2, 3, 4, 5 }), 2);
        assertArrayEquals(root.toArray(), new int[] { 1, 2, 3, 5 });
    }
}
