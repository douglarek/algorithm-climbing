package xin.lingchao.java.algs4.ch01;

import edu.princeton.cs.algs4.Stack;

public class E139 {
    public static String completeParenString(String[] s) {
        if (s == null || s.length == 0) {
            return "";
        }

        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();

        for (String e : s) {

            if (e.equals("(")) {
                continue;
            } else if (e.equals("+") || e.equals("-") || e.equals("*") || e.equals("/") || e.equals("sqrt")) {
                ops.push(e);
            } else if (e.equals(")")) {
                String op = ops.pop();
                String val = vals.pop();

                if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                    val = String.format("( %s %s %s )", vals.pop(), op, val);
                } else if (op.equals("sqrt")) {
                    val = String.format("( %s %s )", op, val);
                }
                vals.push(val);
            } else {
                vals.push(e);
            }
        }
        return vals.pop();
    }
}
