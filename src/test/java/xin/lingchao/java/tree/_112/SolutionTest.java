package xin.lingchao.java.tree._112;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import xin.lingchao.java.structure.TreeNode;

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
