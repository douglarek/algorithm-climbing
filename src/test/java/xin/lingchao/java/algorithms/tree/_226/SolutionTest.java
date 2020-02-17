package xin.lingchao.java.algorithms.tree._226;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testInvertTree() {
        Solution s = new Solution();

        TreeNode t = new TreeNode(4);

        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(1);
        left.right = new TreeNode(3);
        t.left = left;

        TreeNode right = new TreeNode(7);
        right.left = new TreeNode(6);
        right.right = new TreeNode(9);
        t.right = right;

        TreeNode tn = s.invertTree(t);

        assertTrue(tn.val == 4);
        assertTrue(tn.left.val == 7);
        assertTrue(tn.left.left.val == 9);
        assertTrue(tn.left.right.val == 6);
        assertTrue(tn.right.val == 2);
        assertTrue(tn.right.left.val == 3);
        assertTrue(tn.right.right.val == 1);
    }
}
