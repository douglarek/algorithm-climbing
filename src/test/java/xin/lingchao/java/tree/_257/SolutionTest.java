package xin.lingchao.java.tree._257;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

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

        assertThat(s.binaryTreePaths(root), CoreMatchers.is(Arrays.asList("1->2->5", "1->3")));
    }
}
