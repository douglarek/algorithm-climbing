package xin.lingchao.java.leetcode.lcof._57_2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testFindContinuousSequence() {
        Solution s = new Solution();
        assertTrue(Arrays.deepEquals(s.findContinuousSequence(9),
                new int[][] {new int[] {2, 3, 4}, new int[] {4, 5}}));
    }
}
