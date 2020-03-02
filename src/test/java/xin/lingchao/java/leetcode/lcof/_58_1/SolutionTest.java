package xin.lingchao.java.leetcode.lcof._58_1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testReverseWords() {
        Solution s = new Solution();
        assertTrue(s.reverseWords("the sky is blue").equals("blue is sky the"));
    }
}
