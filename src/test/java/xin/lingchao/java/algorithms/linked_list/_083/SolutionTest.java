package xin.lingchao.java.algorithms.linked_list._083;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.ListNode;

public class SolutionTest {
    @Test
    public void testDeleteDuplicates() {
        Solution s = new Solution();

        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(3);

        ListNode n = s.deleteDuplicates(node);
        assertTrue(n.val == 1);
        assertTrue(n.next.val == 2);
        assertTrue(n.next.next.val == 3);
        assertTrue(n.next.next.next == null);
    }
}
