package xin.lingchao.java.leetcode.lcof._53_2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testMissingNumber() {
        Solution s = new Solution();
        int m = s.missingNumber(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 9});
        assertTrue(m == 8);
    }
}
