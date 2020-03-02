package xin.lingchao.java.leetcode.stack._225;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <pre>
 * 使用队列实现栈的下列操作：
 *    push(x) -- 元素 x 入栈
 *    pop() -- 移除栈顶元素
 *    top() -- 获取栈顶元素
 *    empty() -- 返回栈是否为空
 *
 * 注意:
 *    你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 *    你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 *    你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/implement-stack-using-queues/">https://leetcode-cn.com/problems/implement-stack-using-queues/</a>
 */
class MyStack {

    // 我们使用 java 的双端队列 Deque 实现栈, 但是不要用 Deque 的双端队列操作方法(这个谨记!!!).
    // Deque 符合队列操作(FIFO)的基本方法就是 add (亦即 addLast) 和 poll (亦即 pollFirst);
    Deque<Integer> st;

    /** Initialize your data structure here. */
    public MyStack() {
        st = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    // 实现的关键是 push 方法, 我们只要确定每次插入新的元素后确保该新元素在队列头部即可. 方法就是执行一次循环将插入尾部的新元素拿到队列前面即可!
    // push 方法时间复杂度 O(n), 其他方法时间复杂度都是 O(1).
    public void push(int x) {
        st.addLast(x);
        int sz = st.size();
        while (sz > 1) {
            st.addLast(st.pollFirst());
            sz--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return st.pollFirst();
    }

    /** Get the top element. */
    public int top() {
        return st.peekFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj = new MyStack();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top(); boolean param_4 = obj.empty();
 */
