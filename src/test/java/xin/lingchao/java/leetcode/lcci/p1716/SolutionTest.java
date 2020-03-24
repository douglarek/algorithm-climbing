package xin.lingchao.java.leetcode.lcci.p1716;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testMessage() {
        Solution s = new Solution();
        assertTrue(s.massage(new int[] { 2, 7, 9, 3, 1 }) == 12);
        assertTrue(s.massage(new int[] { 1, 2, 3, 1 }) == 4);
    }
}
