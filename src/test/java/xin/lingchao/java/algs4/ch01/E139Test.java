package xin.lingchao.java.algs4.ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class E139Test {
    @Test
    public void testCompleteParenString() {
        String s = E139.completeParenString("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )".split(" "));
        assertEquals(s, "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )");
        s = E139.completeParenString("sqrt 1 + 2 ) )".split(" "));
        assertEquals(s, "( sqrt ( 1 + 2 ) )");
    }
}
