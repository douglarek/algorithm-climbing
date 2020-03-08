package xin.lingchao.java.leetcode.linked_list._0021;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.ListNode;

public class SolutionTest {
    @Test
    public void testMergeTwoLists() {
        Solution s = new Solution();
        ListNode root = s.mergeTwoLists(ListNode.newInstance(new int[] { 1, 2, 4 }),
                ListNode.newInstance(new int[] { 1, 3, 4 }));

        assertArrayEquals(root.toArray(), new int[] { 1, 1, 2, 3, 4, 4 });
    }
}
