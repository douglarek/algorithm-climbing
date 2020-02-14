package xin.lingchao.java.tree._100;

import xin.lingchao.java.structure.TreeNode;

/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * <p>
 * 示例 1:
 *
 * <pre>
 * {@code
 * 输入:    1         1
 *         / \       / \
 *        2   3     2   3
 *
 *       [1,2,3],   [1,2,3]
 *
 * 输出: true
 * }
 * </pre>
 * <p>
 * 示例 2:
 *
 * <pre>
 * {@code
 * 输入:    1          1
 *         /           \
 *        2             2
 *
 *       [1,2],     [1,null,2]
 *
 * 输出: false
 * }
 * </pre>
 * <p>
 * 示例 3:
 *
 * <pre>
 * {@code
 * 输入:    1         1
 *         / \       / \
 *        2   1     1   2
 *
 *       [1,2,1],   [1,1,2]
 *
 *  输出: false
 * }
 * </pre>
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/same-tree/}
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
