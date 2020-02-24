package xin.lingchao.java.algs4.ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Stack;

public class E1312Test {
    @Test
    public void testCopy() {
        Stack<String> s = new Stack<>();
        s.push("Hello");
        s.push("World");
        s.push("!");

        s = E1312.copy(s);

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        assertEquals(sb.toString(), "!WorldHello");
    }
}
