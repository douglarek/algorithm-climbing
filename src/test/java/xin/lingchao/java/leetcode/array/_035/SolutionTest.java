package xin.lingchao.java.leetcode.array._035;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSearchInsert() {
        Solution s = new Solution();

        int result = s.searchInsert(new int[] { 1, 3, 5, 6 }, 2);
        assertTrue(result == 1);
        result = s.searchInsert(new int[] { 1, 3, 5, 6 }, 7);
        assertTrue(result == 4);
        result = s.searchInsert(new int[] { 1, 3, 5, 6 }, 0);
        assertTrue(result == 0);
        result = s.searchInsert(new int[] { 1, 3, 5, 6 }, 5);
        assertTrue(result == 2);
        result = s.searchInsert(new int[] { 1, 3 }, 2);
        assertTrue(result == 1);
        result = s.searchInsert(new int[] { 1, 3, 5 }, 4);
        assertTrue(result == 2);
        result = s.searchInsert(new int[] { 3, 5, 7, 9, 10 }, 8);
        assertTrue(result == 3);
    }
}
