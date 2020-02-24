package xin.lingchao.java.algs4.ch01;

import edu.princeton.cs.algs4.Stack;

public class E1311 {
    public static Double evaluatePostfix(String[] s) {

        if (s == null || s.length == 0) {
            return 0D;
        }

        Stack<Double> vals = new Stack<>();

        for (String e : s) {
            if (e.equals("(") || e.equals(")"))
                ;
            else if (e.equals("+") || e.equals("-") || e.equals("*") || e.equals("/") || e.equals("sqrt")) {
                double v = vals.pop();
                if (e.equals("+"))
                    v = vals.pop() + v;
                else if (e.equals("-"))
                    v = vals.pop() - v;
                else if (e.equals("*"))
                    v = vals.pop() * v;
                else if (e.equals("/"))
                    v = vals.pop() / v;
                else if (e.equals("sqrt"))
                    v = Math.sqrt(v);

                vals.push(v);
            } else {
                vals.push(Double.parseDouble(e));
            }
        }

        return vals.pop();
    }
}
