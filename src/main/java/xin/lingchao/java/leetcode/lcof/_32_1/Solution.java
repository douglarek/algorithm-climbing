package xin.lingchao.java.leetcode.lcof._32_1;

import java.util.ArrayList;
import java.util.List;
import xin.lingchao.java.leetcode.structure.TreeNode;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * <p>
 *
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
 *
 * <p>
 * 返回：
 *
 * <pre>
 * [3,9,20,15,7]
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/">https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/</a>
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(root, res, 0);
        return res.stream().flatMap(List::stream).mapToInt(i -> i).toArray();
    }

    private void bfs(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }

        if (res.size() <= level) {
            res.add(level, new ArrayList<>());
        }

        res.get(level).add(root.val);

        bfs(root.left, res, level + 1);
        bfs(root.right, res, level + 1);
    }
}
