package xin.lingchao.java.algs4.ch01;

import edu.princeton.cs.algs4.Stack;

public class E134 {
    static class Parentheses {
        public static boolean isValid(String s) {
            if (s == null) {
                return true;
            }

            final Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == ']' || c == ')' || c == '}') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    Character p = stack.pop();
                    if (c == ']' && p != '[' || c == ')' && p != '(' || c == '}' && p != '{') {
                        return false;
                    }
                } else {
                    stack.push(c);
                }
            }

            return stack.isEmpty(); // 如果是合法匹配, 栈最后必然是空
        }

    }
}
