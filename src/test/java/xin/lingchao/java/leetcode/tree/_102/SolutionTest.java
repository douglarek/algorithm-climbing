package xin.lingchao.java.leetcode.tree._102;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.leetcode.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testLevelOrder() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;

        List<List<Integer>> res = s.levelOrder(root);

        assertEquals(res, Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7)));
    }
}
