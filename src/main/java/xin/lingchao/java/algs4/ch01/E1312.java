package xin.lingchao.java.algs4.ch01;

import edu.princeton.cs.algs4.Stack;

public class E1312 {
    public static <T> Stack<T> copy(Stack<T> s) {
        Stack<T> tmp = new Stack<>();
        Stack<T> result = new Stack<>();

        while (!s.isEmpty()) {
            tmp.push(s.pop());
        }
        while (!tmp.isEmpty()) {
            result.push(tmp.pop());
        }
        return result;
    }
}
