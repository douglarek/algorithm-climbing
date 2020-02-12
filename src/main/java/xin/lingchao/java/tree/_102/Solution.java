package xin.lingchao.java.tree._102;

import java.util.ArrayList;
import java.util.List;

import xin.lingchao.java.structure.TreeNode;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如: 给定二叉树: [3,9,20,null,null,15,7],
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
 * 返回其层次遍历结果：
 *
 * <pre>
 * {@code
 * [
 *  [3],
 *  [9,20],
 *  [15,7]
 * ]
 * }
 * </pre>
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/binary-tree-level-order-traversal/}
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }

        if (res.size() <= level) {
            res.add(level, new ArrayList<>());
        }

        res.get(level).add(root.val);

        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
    }

}
