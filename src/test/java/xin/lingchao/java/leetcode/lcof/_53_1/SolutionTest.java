package xin.lingchao.java.leetcode.lcof._53_1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSearch() {
        Solution s = new Solution();
        int c = s.search(new int[] { 5, 7, 7, 8, 8, 10 }, 8);
        assertTrue(c == 2);
    }
}
