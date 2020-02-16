package xin.lingchao.java.tree._111;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testMinDepth() {

        Solution s = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);

        int depth = s.minDepth(root);
        assertTrue(depth == 2);

        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;

        depth = s.minDepth(root);
        assertTrue(depth == 2);
    }
}
