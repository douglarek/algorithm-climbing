package xin.lingchao.java.tree._101;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    private Solution s = new Solution();
    private Supplier<TreeNode> newTreeNode = () -> {
        TreeNode root = new TreeNode(1);

        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(3);
        left.right = new TreeNode(4);
        root.left = left;

        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(4);
        right.right = new TreeNode(3);
        root.right = right;

        return root;
    };

    @Test
    public void testIsSymmetric() {
        assertTrue(s.isSymmetric(newTreeNode.get()));
    }

    @Test
    public void testIsSymmetricIteration() {
        s.isSymmetricIteration(newTreeNode.get());
    }
}
