package xin.lingchao.java.tree._107;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testLevelOrderBottom() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;

        List<List<Integer>> res = s.levelOrderBottom(root);
        assertEquals(res, Arrays.asList(Arrays.asList(15, 7), Arrays.asList(9, 20), Arrays.asList(3)));
    }
}
