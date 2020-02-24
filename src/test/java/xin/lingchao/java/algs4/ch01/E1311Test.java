package xin.lingchao.java.algs4.ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class E1311Test {
    @Test
    public void testEvaluatePostfix() {
        double r = E1311.evaluatePostfix("1 2 3 + 4 5 * * +".split(" "));
        assertEquals(r, 101.0, 0.001);
        r = E1311.evaluatePostfix("1 5 sqrt + 2.0 /".split(" "));
        assertEquals(r, 1.618033988749895, 0.001);
    }

}
