package xin.lingchao.java.algorithms.tree._108;

import xin.lingchao.java.structure.TreeNode;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 *
 * <pre>
 * {@code
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 * }
 * </pre>
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/}
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int p = (left + right) >>> 1; // (left + right) / 2, 取左中节点, 此处还可以选择中右元素或者随机

        // 中序
        TreeNode root = new TreeNode(nums[p]);
        root.left = dfs(nums, left, p - 1);
        root.right = dfs(nums, p + 1, right);
        return root;
    }
}
