package xin.lingchao.java.leetcode.lcof._32_1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import xin.lingchao.java.leetcode.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testLevelOrder() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;

        assertArrayEquals(s.levelOrder(root), new int[] {3, 9, 20, 15, 7});
    }
}
