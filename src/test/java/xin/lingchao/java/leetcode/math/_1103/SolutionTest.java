package xin.lingchao.java.leetcode.math._1103;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testDistributeCandies() {
        Solution s = new Solution();
        assertArrayEquals(s.distributeCandies(10, 3), new int[] {5, 2, 3});
    }
}
