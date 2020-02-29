package xin.lingchao.java.leetcode.lcof._31;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testValidateStackSequences() {
        Solution s = new Solution();
        assertTrue(s.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5, 3, 2, 1}));
        assertFalse(s.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 3, 5, 1, 2}));
    }
}
