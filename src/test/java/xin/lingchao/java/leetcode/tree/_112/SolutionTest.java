package xin.lingchao.java.leetcode.tree._112;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testHasPathSum() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(2);

        assertTrue(s.hasPathSum(root, 2));

        root.left = new TreeNode(4);
        root.right = new TreeNode(6);

        assertTrue(s.hasPathSum(root, 6));
    }
}
