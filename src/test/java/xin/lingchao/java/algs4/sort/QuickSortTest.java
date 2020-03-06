package xin.lingchao.java.algs4.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void testSort() {
        Sort qs = new QuickSort();
        int[] a = new int[] {10, 9, 1, 2, 3};
        qs.sort(a);
        assertArrayEquals(a, new int[] {1, 2, 3, 9, 10});
    }
}
