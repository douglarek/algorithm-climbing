package xin.lingchao.java.array._001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void TestTwoSum() {
        Solution s = new Solution();
        assertArrayEquals(s.twoSum(new int[] { 2, 7, 11, 15 }, 9), new int[] { 0, 1 });
    }
}
