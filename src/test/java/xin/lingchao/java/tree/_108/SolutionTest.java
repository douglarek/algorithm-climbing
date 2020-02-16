package xin.lingchao.java.tree._108;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testSortedArrayToBST() {
        Solution s = new Solution();
        TreeNode root = s.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
        assertTrue(root.val == 0);
        assertTrue(root.left.val == -10);
        assertTrue(root.left.right.val == -3);
        assertTrue(root.right.val == 5);
        assertTrue(root.right.right.val == 9);
    }
}
