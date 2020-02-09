package xin.lingchao.java.two_pointers._027;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
