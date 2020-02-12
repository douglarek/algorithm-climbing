package xin.lingchao.java.tree._111;

import xin.lingchao.java.structure.TreeNode;

/**
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * <b>最小深度是从根节点到最近叶子节点的最短路径上的节点数量。</b>
 * <p>
 * <b>说明: 叶子节点是指没有子节点的节点。</b>
 * <p>
 * <b>示例:</b>
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7],
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
 *
 * <p>
 * 返回它的最小深度 2.
 *
 * <p>
 *
 * {@link https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/}
 *
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDep = minDepth(root.left);
        int rightDep = minDepth(root.right);

        if (leftDep == 0 && rightDep != 0) {
            return 1 + rightDep;
        } else if (leftDep != 0 && rightDep == 0) {
            return 1 + leftDep;
        } else {
            return Math.min(1 + leftDep, 1 + rightDep);
        }
    }
}
