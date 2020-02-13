package xin.lingchao.java.tree._235;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import xin.lingchao.java.structure.TreeNode;

public class SolutionTest {
    @Test
    public void testLowestCommonAncestor() {
        Solution s = new Solution();

        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(4);
        root.left = left;

        TreeNode node = s.lowestCommonAncestor(root, left, root);
        assertThat(root, CoreMatchers.is(node));

        root.left = null;
        root.right = left;
        node = s.lowestCommonAncestor(root, root, left);
        assertThat(root, CoreMatchers.is(node));
    }
}
