package xin.lingchao.java.leetcode.lcof._32_3;

import java.util.ArrayList;
import java.util.List;
import xin.lingchao.java.leetcode.structure.TreeNode;

/**
 *
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * <p>
 *
 * 例如:给定二叉树: [3,9,20,null,null,15,7],
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
 * 返回其层次遍历结果：
 * <P>
 *
 * <pre>
 * {@code
 * [
 *  [3],
 *  [20,9],
 *  [15,7]
 *]
 * }
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/">https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/</a>
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(root, res, 0);
        return res;
    }

    private void bfs(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }

        if (res.size() <= level) {
            res.add(level, new ArrayList<>());
        }

        if (level % 2 == 0) {
            res.get(level).add(root.val);
        } else {
            res.get(level).add(0, root.val);
        }

        bfs(root.left, res, level + 1);
        bfs(root.right, res, level + 1);
    }
}
