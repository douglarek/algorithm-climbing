package xin.lingchao.java.tree._235;

import xin.lingchao.java.structure.TreeNode;

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * <p>
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x
 * 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * <p>
 * 例如，给定如下二叉搜索树: root = [6,2,8,0,4,7,9,null,null,3,5]
 * <p>
 * 示例 1:
 *
 * <pre>
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * 输出: 6
 * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 * </pre>
 *
 * <p>
 * 示例 2:
 *
 * <pre>
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4 输出: 2 解释: 节点 2 和节点 4
 * 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
 * </pre>
 *
 * <p>
 *
 * {@link https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/}
 *
 */
class Solution {
    /*
     * 二叉搜索树（BST）的性质: 节点 N 左子树上的所有节点的值都小于等于节点N 的值; 节点 N 右子树上的所有节点的值都大于等于节点 N 的值;
     * 左子树和右子树也都是 BST
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 这里不需要判断 root 是否为 null 因为题目最后已经说明: p, q 为不同节点且均存在于给定的二叉搜索树中
        if (p.val < root.val && q.val < root.val) {
            // 根据二叉搜索树的性质, 如果 p q 都比 root 的值小, 说明都在左子树, 递归左子树即可
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            // 根据二叉搜索树的性质, 如果 p q 都比 root 的值大, 说明都在右子树, 递归右子树即可
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
