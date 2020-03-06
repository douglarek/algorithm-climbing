package xin.lingchao.java.leetcode.lcof._57_2;

import java.util.LinkedList;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * <p>
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * <p>
 * <b>示例 1：</b>
 *
 * <pre>
 * 输入：target = 9
  * 输出：[[2,3,4],[4,5]]
 * </pre>
 *
 * <p>
 * <b>示例 2：</b>
 *
 * <pre>
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/">https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/</a>
 */
class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new LinkedList<>(); // 此处使用 LinkedList 而不是 ArrayList , 因为需要头插入
        int i = 2; // 起始组

        for (;;) {
            // 该组起始数字, 这个公式的来源: 比如 2 个, 那么 2x + 1 = target,
            // 其实就是 x + 0 + x + 1 = target, 所以就是 2x + (0, 1 组成的等差数列) = target,
            // 那么对于 i 个数组成的组就是: d * i + (i - 1) * i / 2 = target
            int d = (target - (i - 1) * i / 2) / i; // 该组起始数字
            int m = (target - (i - 1) * i / 2) % i; // 余数

            if (d == 0) { // 终止条件
                break;
            }

            if (d != 0 && m > 0) { // 如果余数不为 0 需要跳过继续
                i++;
                continue;
            }

            int[] e = new int[i];
            for (int j = 0; j < i; j++) {
                e[j] = d + j;
            }
            res.add(0, e); // 头插入, 组元素多的一定排前面
            i++;
        }

        return res.toArray(new int[0][]);
    }
}
