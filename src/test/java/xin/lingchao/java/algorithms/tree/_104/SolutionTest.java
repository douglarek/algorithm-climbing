package xin.lingchao.java.algorithms.tree._104;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testMaxDepth() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        root.left = left;
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;

        assertEquals(s.maxDepth(root), 3);
        assertEquals(s.maxDepthIteration(root), 3);
    }
}