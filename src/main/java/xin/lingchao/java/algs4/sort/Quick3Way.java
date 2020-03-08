package xin.lingchao.java.algs4.sort;

public class Quick3Way implements Sort {

    @Override
    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int lt = lo, i = lo + 1, gt = hi;
        int v = a[lo];
        while (i <= gt) {
            if (a[i] < v) {
                swap(a, lt++, i++); // a[lo...lt-1] 中的元素都小于 v
            } else if (a[i] > v) {
                swap(a, i, gt--); // a[gt+1...hi] 中的元素都大于 v
            } else {
                i++; // a[lt...i-1] 中的元素都等于 v
            }
        } // 切分后 a[lo...lt-1] < v = a[lt...gt] < a[gt+1...hi] 成立

        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }

}
