package xin.lingchao.java.leetcode.tree._104;

import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;
import java.util.Queue;

import xin.lingchao.java.leetcode.structure.TreeNode;

/**
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：给定二叉树 [3,9,20,null,null,15,7]
 *
 * <pre>
 * {@code
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * }
 * </pre>
 *
 * <p>
 * 返回它的最大深度 3。
 *
 * <p>
 * {@link https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/}
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }

    /*
     * 迭代: 队列实现的 BFS
     */
    public int maxDepthIteration(TreeNode root) {
        Queue<SimpleEntry<TreeNode, Integer>> bfs = new LinkedList<>();

        if (root != null) {
            bfs.add(new SimpleEntry<>(root, 1));
        }

        int depth = 0;

        while (!bfs.isEmpty()) {
            SimpleEntry<TreeNode, Integer> curr = bfs.poll();
            root = curr.getKey();
            if (root != null) {
                int currDepth = curr.getValue();
                depth = Math.max(currDepth, depth);
                bfs.add(new SimpleEntry<TreeNode, Integer>(root.left, currDepth + 1));
                bfs.add(new SimpleEntry<TreeNode, Integer>(root.right, currDepth + 1));
            }
        }
        return depth;
    }
}
