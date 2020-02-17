package xin.lingchao.java.algorithms.tree._107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import xin.lingchao.java.structure.TreeNode;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如： 给定二叉树 [3,9,20,null,null,15,7],
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
 * 返回其自底向上的层次遍历为：
 *
 * <pre>
 * {@code
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * }
 * </pre>
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/}
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, res);
        Collections.reverse(res); // 需逆序
        return res;
    }

    /*
     * 前序遍历, 需使用 level 记录当前数的层次, 方便分别添加当前节点值到 res.
     */
    private void dfs(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }

        if (res.size() <= level) {
            res.add(level, new ArrayList<>()); // 此时需新建一个 list 装 当前节点值
        }

        res.get(level).add(root.val);
        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
    }
}
