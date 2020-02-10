package xin.lingchao.java.linked_list._206;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import xin.lingchao.java.structure.ListNode;

public class SolutionTest {
    @Test
    public void testReverseList() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution s = new Solution();

        ListNode reversedHead = s.reverseList(head);
        assertTrue(reversedHead.val == 5);
        assertTrue(reversedHead.next.val == 4);
        assertTrue(reversedHead.next.next.val == 3);
        assertTrue(reversedHead.next.next.next.val == 2);
        assertTrue(reversedHead.next.next.next.next.val == 1);
    }

    @Test
    public void testReverseListRecursively() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution s = new Solution();

        ListNode reversedHead = s.reverseListRecursively(head);
        assertTrue(reversedHead.val == 5);
        assertTrue(reversedHead.next.val == 4);
        assertTrue(reversedHead.next.next.val == 3);
        assertTrue(reversedHead.next.next.next.val == 2);
        assertTrue(reversedHead.next.next.next.next.val == 1);
    }
}
