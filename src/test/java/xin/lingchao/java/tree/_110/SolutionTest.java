package xin.lingchao.java.tree._110;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testIsBalanced() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);

        assertTrue(s.isBalanced(root));
    }
}
