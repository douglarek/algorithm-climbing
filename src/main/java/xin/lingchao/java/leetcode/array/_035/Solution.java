package xin.lingchao.java.leetcode.array._035;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 *
 * <p>
 * <b>示例 1:</b>
 *
 * <pre>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * </pre>
 *
 * <b>示例 2:</b>
 *
 * <pre>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * </pre>
 *
 * <b>示例 3:</b>
 *
 * <pre>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * </pre>
 *
 * <b>示例 4:</b>
 *
 * <pre>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * </pre>
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/search-insert-position/}
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) { // 二分的边界非常容易出错. j = len -1 此处应 <= ; 下面应 j = mid -1
            int mid = (i + j) >>> 1;
            if (nums[mid] > target) {
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }

        return i;
    }
}
