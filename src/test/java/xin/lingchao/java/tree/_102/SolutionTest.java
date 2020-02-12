package xin.lingchao.java.tree._102;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import xin.lingchao.java.structure.TreeNode;

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
        assertThat(res, CoreMatchers.is(Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7))));
    }
}
