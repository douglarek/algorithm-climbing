package xin.lingchao.java.tree._257;

import java.util.ArrayList;
import java.util.List;

import xin.lingchao.java.structure.TreeNode;

/**
 * <h1>257. 二叉树的所有路径</h1>
 *
 * <p>
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * <p>
 * 示例:
 *
 * <pre>
 * {@code
 *  输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 * }
 * </pre>
 *
 * <p>
 *
 * {@link https://leetcode-cn.com/problems/binary-tree-paths/}
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }

    /*
     * 递归的思路, 对于当前节点使用 acc 累加, 直到左右子树都为空(即叶子节点) 将其添加到 res, 然后分别对左右子树递归
     */
    private void dfs(TreeNode root, String acc, List<String> res) {
        if (root == null) {
            return; // 终止条件
        }

        acc = acc == "" ? root.val + "" : acc + "->" + root.val;

        if (root.left == null && root.right == null) {
            res.add(acc); // 叶子节点时添加到总 list
            return; // 终止与否都可; 因为 root == null 兜底了, 加了少一层递归
        }

        dfs(root.left, acc, res);
        dfs(root.right, acc, res);
    }
}
