package xin.lingchao.java.algs4.sort;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] a) {
        // StdRandom.shuffle(a); // 清除对输入的依赖
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    // 切片方法, 结合切分轨迹理解
    private int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = a[lo];

        while (true) {
            // 此处之所以先 +i 和 -j, 因为上面需要排除掉 i 和 v 的比较以及抵消 j = hi + 1
            while (a[++i] < v && i < hi)
                ;
            while (v < a[--j] && j > lo)
                ; // 此处 j > lo 的约束是不需要的, 因为切分的元素是 a[lo] 不可能比自己小, 即不会越界

            if (i >= j) {
                break;
            }

            swap(a, i, j);
        }

        swap(a, lo, j);
        return j;
        // 以下为算法导论的写法
        // int v = a[hi];
        // int i = lo - 1;
        // for (int j = lo; j < hi; j++) {
        // if (a[j] <= v) {
        // i++;
        // swap(a, i, j);
        // }
        // }

        // swap(a, i + 1, hi);
        // return i + 1;
    }
}
