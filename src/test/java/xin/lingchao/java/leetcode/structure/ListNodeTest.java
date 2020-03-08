package xin.lingchao.java.leetcode.structure;

import org.junit.jupiter.api.Test;

public class ListNodeTest {
    @Test
    public void testNewInstance() {
        ListNode root = ListNode.newInstance(new int[] {1, 2, 3, 4, 5});
        root.show();
    }
}
