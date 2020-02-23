package xin.lingchao.java.algs4.ch01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xin.lingchao.java.algs4.ch01.E134.Parentheses;

public class E134Test {

    @Test
    public void testIsValid() {
        assertTrue(Parentheses.isValid("[()]{}{[()()]()}"));
        assertFalse(Parentheses.isValid("[(])"));
        assertFalse(Parentheses.isValid("[]("));
    }

}
