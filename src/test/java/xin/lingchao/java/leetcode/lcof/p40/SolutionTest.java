package xin.lingchao.java.leetcode.lcof.p40;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testGetLeastNumbers() {
        Solution s = new Solution();

        int[] arr = s.getLeastNumbers(new int[] {0, 1, 2, 1}, 1);
        assertArrayEquals(arr, new int[] {0});
    }
}
