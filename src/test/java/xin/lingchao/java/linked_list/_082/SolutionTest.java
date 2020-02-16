package xin.lingchao.java.linked_list._082;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.ListNode;

public class SolutionTest {
    @Test
    public void testDeleteDuplicates() {
        Solution s = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);

        ListNode node = s.deleteDuplicates(head);
        assertTrue(node.val == 2);
        assertTrue(node.next.val == 3);
    }
}
