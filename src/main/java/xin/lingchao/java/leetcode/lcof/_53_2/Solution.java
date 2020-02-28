package xin.lingchao.java.leetcode.lcof._53_2;

/**
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * <p>
 *
 * <b>示例 1:</b>
 *
 * <pre>
 * {@code
 * 输入: [0,1,3]
 * 输出: 2
 * }
 * </pre>
 *
 * <p>
 *
 * <b>示例 2:</b>
 *
 * <pre>
 * {@code
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 * }
 * </pre>
 *
 * <p>
 * <b>限制：</b>
 *
 * <pre>
 * {@code 1 <= 数组长度 <= 10000}
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/">https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/</a>
 */
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] != m) { // 二分移动条件, 如果值等于下标则说明左边连续, 去右边查找即可
                j = m - 1;
            } else {
                i = m + 1;
            }
        }

        // 跳出 while 之后, i 即为缺失数, 比如空数组, 缺失 nums[0] = 0, 如果是恰好连续, 则 i = m + 1 =
        // nums.length
        return i;
    }
}
