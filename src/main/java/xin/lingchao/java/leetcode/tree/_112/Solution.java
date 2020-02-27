package xin.lingchao.java.leetcode.tree._112;

import xin.lingchao.java.leetcode.structure.TreeNode;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * <p>
 * <b>说明:</b> 叶子节点是指没有子节点的节点。
 * <p>
 * <b>示例: </b>
 * <p>
 * 给定如下二叉树，以及目标和 sum = 22
 *
 * <pre>
 * {@code
 *             5
 *            / \
 *           4   8
 *          /   / \
 *         11  13  4
 *        /  \      \
 *       7    2      1
 * }
 * </pre>
 *
 * <p>
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5-&gt;4-&gt;11-&gt;2。
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/path-sum/}
 *
 */
class Solution {

    /*
     * 如何使用递归思想, 其实就是 : func(root, sum) = func(root.left, sum - root.val) ||
     * func(root.right, sum - root.val)
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false; // 第一种终止条件用于递归跳出左右子树
        }

        sum -= root.val;

        if (root.left == null && root.right == null) {
            return sum == 0; // 此处是 root 终止条件, 如果无叶子, 则判断 (sum - root.val) == 0
        }

        // 否则判断左或者右的 sum == root.val
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
