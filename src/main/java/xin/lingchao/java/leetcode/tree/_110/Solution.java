package xin.lingchao.java.leetcode.tree._110;

import xin.lingchao.java.leetcode.structure.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * <p>
 * 示例 1:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 * <pre>
 * {@code
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * }
 * </pre>
 * <p>
 * 返回 true 。
 *
 * <p>
 * 示例 2:
 * <p>
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 * <pre>
 * {@code
 *       1
 *      / \
 *     2   2
 *    / \
 *   3   3
 *  / \
 * 4   4
 * }
 * </pre>
 *
 * <p>
 * 返回 false 。
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/balanced-binary-tree/}
 */
class Solution {
    /* // 普通递归方式 */
    // public boolean isBalanced(TreeNode root) {
    // if (root == null) {
    // return true;
    // }

    // return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 &&
    // isBalanced(root.left)
    // && isBalanced(root.right);
    // }

    // private int maxDepth(TreeNode root) {
    // if (root == null) {
    // return 0;
    // }

    // return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    /* } */

    // dfs 提前阻断法
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        if (left == -1) {
            return -1;
        }
        int right = maxDepth(root.right);
        if (right == -1) {
            return -1;
        }

        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
    }
}
