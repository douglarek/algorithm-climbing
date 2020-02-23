package xin.lingchao.java.algs4.ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class E1310Test {
    @Test
    public void testInfixToPostfix() {
        String s = E1310.InfixToPostfix("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )".split(" "));
        assertEquals(s, "1 2 3 + 4 5 * * +");
        s = E1310.InfixToPostfix("( sqrt ( 1 + 2 ) )".split(" "));
        assertEquals(s, "1 2 + sqrt");
    }
}
