package xin.lingchao.java.leetcode.linked_list._206;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.ListNode;

public class SolutionTest {

    private Supplier<ListNode> newListNode = () -> {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        return head;
    };

    private Consumer<ListNode> assertResult = (ListNode node) -> {
        assertTrue(node.val == 5);
        assertTrue(node.next.val == 4);
        assertTrue(node.next.next.val == 3);
        assertTrue(node.next.next.next.val == 2);
        assertTrue(node.next.next.next.next.val == 1);
    };

    @Test
    public void testReverseList() {
        Solution s = new Solution();
        ListNode node = s.reverseList(newListNode.get());
        assertResult.accept(node);
    }

    @Test
    public void testReverseListRecursively() {
        Solution s = new Solution();
        ListNode node = s.reverseListRecursively(newListNode.get());
        assertResult.accept(node);
    }
}
