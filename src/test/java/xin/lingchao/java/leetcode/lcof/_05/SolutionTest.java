package xin.lingchao.java.leetcode.lcof._05;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testReplaceSpace() {
        Solution s = new Solution();
        assertTrue(s.replaceSpace("We are happy.").equals("We%20are%20happy."));
    }
}
