package xin.lingchao.java.algs4.ch01;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class E135Test {
    @Test
    public void testE135() {

        Stack<Integer> stack = new Stack<>();
        int N = 50;

        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }

        // 输出 N 的二进制表示
        for (int d : stack) {
            StdOut.print(d);
        }

        StdOut.println();
    }
}
