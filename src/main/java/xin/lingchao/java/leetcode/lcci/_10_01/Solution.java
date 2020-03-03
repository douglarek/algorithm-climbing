package xin.lingchao.java.leetcode.lcci._10_01;

/**
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * <p>
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 *
 * <p>
 * <b>示例:</b>
 *
 * <pre>
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * 输出: [1,2,2,3,5,6]
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/sorted-merge-lcci/">https://leetcode-cn.com/problems/sorted-merge-lcci/</a>
 */
class Solution {

    // 此题思路来自 < 数据结构与算法分析 C 语言描述 > 173 页 7.6 归并排序, 只不过此处是借助 A 末端空间没有开辟新的 C.
    public void merge(int[] A, int m, int[] B, int n) {
        int aEnd = m - 1; // A 实际的尾部
        int bEnd = n - 1; // B 实际的尾部
        int curr = m + n - 1; // 关键: 这个限制了从 A 的尾部的合适位置往前( 如果不限制这个那么 A 的末尾大于 B 的时候出错 )

        while (aEnd >= 0 && bEnd >= 0) {
            if (A[aEnd] < B[bEnd]) {
                A[curr--] = B[bEnd--]; // 如果 B 索引处元素大则追到 A 的尾部, 并移动索引位置
            } else {
                A[curr--] = A[aEnd--]; // 如果 A 索引处元素大则追到 A 的尾部, 并移动索引位置
            }
        }

        // 如果 aEnd >= 0, 说明就已经好了; 但是如果 B 还有就需要把剩余的 B 放到 A 前面
        while (bEnd >= 0) {
            A[curr--] = B[bEnd--];
        }

    }
}
