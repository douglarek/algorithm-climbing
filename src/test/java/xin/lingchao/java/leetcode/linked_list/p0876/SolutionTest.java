package xin.lingchao.java.leetcode.linked_list.p0876;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.ListNode;

public class SolutionTest {
    @Test
    public void testMiddleNode() {
        Solution s = new Solution();

        ListNode node = s.middleNode(ListNode.newInstance(new int[] { 1, 2, 3, 4, 5 }));
        assertArrayEquals(node.toArray(), new int[] { 3, 4, 5 });

        node = s.middleNode(ListNode.newInstance(new int[] { 1, 2, 3, 4, 5, 6 }));
        assertArrayEquals(node.toArray(), new int[] { 4, 5, 6 });
    }
}
