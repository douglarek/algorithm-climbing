package xin.lingchao.java.tree._100;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testIsSameTree() {
        Solution s = new Solution();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);

        assertFalse(s.isSameTree(p, q));
    }
}
