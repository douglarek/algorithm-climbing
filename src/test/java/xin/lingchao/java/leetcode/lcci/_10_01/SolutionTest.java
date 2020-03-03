package xin.lingchao.java.leetcode.lcci._10_01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testMerge() {
        Solution s = new Solution();

        int[] a = new int[] { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] b = new int[] { 2, 5, 6 };
        int n = 3;
        s.merge(a, m, b, n);

        assertArrayEquals(a, new int[] { 1, 2, 2, 3, 5, 6 });
    }
}
