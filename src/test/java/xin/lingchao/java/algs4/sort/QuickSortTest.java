package xin.lingchao.java.algs4.sort;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void testSort() {
        Sort qs = new QuickSort();
        int[] a = new int[] {0, 10, 9, 1, 2, 3, 2, 1};
        qs.show(a);
        qs.sort(a);
        assertTrue(qs.isSorted(a));
        qs.show(a);
    }
}
