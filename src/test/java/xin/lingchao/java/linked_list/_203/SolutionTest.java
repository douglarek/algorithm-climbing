package xin.lingchao.java.linked_list._203;

import static org.junit.Assert.assertTrue;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.Test;

import xin.lingchao.java.structure.ListNode;

public class SolutionTest {

    @Test
    public void testRemoveElements() {
        Solution s = new Solution();

        Supplier<ListNode> newListNode = () -> {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(6);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(4);
            head.next.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next.next = new ListNode(6);
            return head;
        };

        Consumer<ListNode> assertResult = (ListNode node) -> {
            assertTrue(node.val == 1);
            assertTrue(node.next.val == 2);
            assertTrue(node.next.next.val == 3);
            assertTrue(node.next.next.next.val == 4);
            assertTrue(node.next.next.next.next.val == 5);
        };

        ListNode node = s.removeElements(newListNode.get(), 6);
        assertResult.accept(node);

        node = s.removeElementsRecursively(newListNode.get(), 6);
        assertResult.accept(node);
    }
}
