package xin.lingchao.java.array._001;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * <b> 示例: </b>
 *
 * <pre>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * </pre>
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }

        Map<Integer, Integer> tmp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tmp.containsKey(target - nums[i])) {
                return new int[] { tmp.get(target - nums[i]), i };
            }
            tmp.put(nums[i], i);
        }
        return null;
    }
}
