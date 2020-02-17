package xin.lingchao.java.algorithms.tree._257;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testBinaryTreePaths() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.right = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(3);

        assertEquals(s.binaryTreePaths(root), Arrays.asList("1->2->5", "1->3"));
    }
}
