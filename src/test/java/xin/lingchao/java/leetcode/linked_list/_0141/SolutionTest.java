package xin.lingchao.java.leetcode.linked_list._0141;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import xin.lingchao.java.leetcode.structure.ListNode;

public class SolutionTest {
    @Test
    public void testHasCycle() {
        Solution s = new Solution();

        ListNode root = new ListNode(3);
        root.next = new ListNode(2);
        root.next.next = new ListNode(0);
        root.next.next.next = new ListNode(-4);
        root.next.next.next.next = root.next;

        assertTrue(s.hasCycle(root));
    }
}
