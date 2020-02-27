package xin.lingchao.java.leetcode.lcof._30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinStackTest {
    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(minStack.min(), -3);
        minStack.pop();
        assertEquals(minStack.top(), 0);
        assertEquals(minStack.min(), -2);
    }
}
