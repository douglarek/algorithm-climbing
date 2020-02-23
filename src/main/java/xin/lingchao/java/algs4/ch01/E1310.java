package xin.lingchao.java.algs4.ch01;

import edu.princeton.cs.algs4.Stack;

public class E1310 {
    public static String InfixToPostfix(String[] s) {
        Stack<String> vals = new Stack<>();
        Stack<String> ops = new Stack<>();
        for (String e : s) {
            if (e.equals("(")) {
                continue;
            } else if (e.equals("+") || e.equals("-") || e.equals("*") || e.equals("/") || e.equals("sqrt")) {
                ops.push(e);
            } else if (e.equals(")")) {
                String op = ops.pop();
                String val = vals.pop();
                if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                    val = String.format("%s %s %s", vals.pop(), val, op);
                } else if (op.equals("sqrt")) {
                    val = String.format("%s %s", val, op);
                }
                vals.push(val);
            } else {
                vals.push(e);
            }
        }
        return vals.pop();
    }
}
