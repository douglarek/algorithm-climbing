package xin.lingchao.java.tree._101;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import xin.lingchao.java.structure.TreeNode;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 * <pre>
 * {@code
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * }
 * </pre>
 * <P>
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 * <pre>
 * {@code
 *   1
 *   / \
 *  2   2
 *   \   \
 *   3    3
 * }
 * </pre>
 *
 * <p>
 *
 * {@link https://leetcode-cn.com/problems/symmetric-tree/}
 *
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root, root);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && dfs(left.left, right.right) && dfs(right.left, left.right);
    }

    /*
     * 迭代版
     */
    public boolean isSymmetricIteration(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(); // 双向链表实现二叉树层级遍历
        q.add(root);
        q.add(root);

        while (!q.isEmpty()) {
            // 头部取链表元素
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();

            if (t1 == null && t2 == null) {
                continue;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }

            // 尾部插入元素
            q.addAll(Arrays.asList(t1.left, t2.right, t1.right, t2.left));
        }
        return true;
    }
}
