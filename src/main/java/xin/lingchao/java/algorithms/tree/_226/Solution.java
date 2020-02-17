package xin.lingchao.java.algorithms.tree._226;

import xin.lingchao.java.structure.TreeNode;

/**
 * 翻转一棵二叉树。
 *
 * <p>
 *
 * {@link https://leetcode-cn.com/problems/invert-binary-tree/}
 **/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // 终止条件
        if (root == null) {
            return null;
        }

        // 如下是交换当前节点的左右子树
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 如下是递归地交换左右子树
        invertTree(root.left);
        invertTree(root.right);
        // 左右都交换完了返回当前节点
        return root;
    }
}
