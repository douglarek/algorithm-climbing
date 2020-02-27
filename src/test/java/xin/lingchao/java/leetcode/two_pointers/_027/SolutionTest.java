package xin.lingchao.java.leetcode.two_pointers._027;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testRemoveElement() {

        Solution s = new Solution();

        int result = s.removeElement(new int[] { 3, 2, 2, 3 }, 3);
        assertEquals(result, 2);

        result = s.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);
        assertEquals(result, 5);
    }
}
