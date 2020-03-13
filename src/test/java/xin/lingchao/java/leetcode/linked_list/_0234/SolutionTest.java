package xin.lingchao.java.leetcode.linked_list._0234;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import xin.lingchao.java.leetcode.structure.ListNode;

public class SolutionTest {
    @Test
    public void testIsPalindrome() {
        Solution s = new Solution();
        assertTrue(s.isPalindrome(ListNode.newInstance(new int[] {1, 2, 2, 1})));
    }
}
