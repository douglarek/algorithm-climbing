package xin.lingchao.java.leetcode.tree._235;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testLowestCommonAncestor() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(4);
        root.left = left;

        TreeNode node = s.lowestCommonAncestor(root, left, root);
        assertEquals(root, node);

        root.left = null;
        root.right = left;
        node = s.lowestCommonAncestor(root, root, left);
        assertEquals(root, node);
    }
}
