package xin.lingchao.java.lcof._06;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.ListNode;

public class SolutionTest {
    @Test
    public void testReversePrint() {
        Solution s = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);

        assertArrayEquals(s.reversePrint(head), new int[] { 2, 3, 1 });
    }
}
