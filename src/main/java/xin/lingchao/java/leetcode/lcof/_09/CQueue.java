package xin.lingchao.java.leetcode.lcof._09;

import java.util.ArrayDeque;
import java.util.Deque;

class CQueue {

    // 使用 ArrayDeque 取代 Stack
    private Deque<Integer> in = new ArrayDeque<>(); // append 栈
    private Deque<Integer> out = new ArrayDeque<>(); // delete 栈

    public CQueue() {

    }

    public void appendTail(int value) {
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        in.push(value);
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }

    public int deleteHead() {
        if (!out.isEmpty()) {
            return out.pop();
        }
        return -1;
    }
}

/**
 * Your CQueue object will be instantiated and called as such: CQueue obj = new
 * CQueue(); obj.appendTail(value); int param_2 = obj.deleteHead();
 */
