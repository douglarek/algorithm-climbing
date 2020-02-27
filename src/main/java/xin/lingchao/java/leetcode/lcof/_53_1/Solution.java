package xin.lingchao.java.leetcode.lcof._53_1;

/**
 *
 * 统计一个数字在排序数组中出现的次数。
 * <p>
 * <b>示例 1:</b>
 *
 * <pre>
 *  输入: nums = [5,7,7,8,8,10], target = 8
 *  输出: 2
 * </pre>
 *
 * <p>
 * <b>示例 2:</b>
 *
 * <pre>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 * </pre>
 *
 * <p>
 * <b>限制：</b>
 *
 * <pre>
 * {@code 0 <= 数组长度 <= 50000}
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/">https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/</a>
 */
class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        int count = 0;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] > target) {
                j = m - 1;
            } else if (nums[m] < target) {
                i = m + 1;
            } else {
                count++;
                for (int k = m + 1; k <= nums.length - 1; k++) {
                    if (target == nums[k]) {
                        count++;
                    }
                }
                for (int k = m - 1; k >= 0; k--) {
                    if (target == nums[k]) {
                        count++;
                    }
                }
                break;
            }

        }
        return count;

    }
}
