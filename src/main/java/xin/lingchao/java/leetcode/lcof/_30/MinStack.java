package xin.lingchao.java.leetcode.lcof._30;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * <p>
 * <b>示例:</b>
 *
 * <pre>
 * {@code
 *   MinStack minStack = new MinStack();
 *   minStack.push(-2);
 *   minStack.push(0);
 *   minStack.push(-3);
 *   minStack.min();   --> 返回 -3.
 *   minStack.pop();
 *   minStack.top();      --> 返回 0.
 *   minStack.min();   --> 返回 -2.
 * }
 * </pre>
 *
 * <b>提示：</b> 1. 各函数的调用总次数不超过 20000 次
 *
 * <p>
 * See <a href=
 * "https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/">https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/</a>
 *
 */
class MinStack {

    /*
     * 实现的思路就是使用两个栈, 一个用于正常的 pop push top 操作, 一个用于 min 的存取.
     */
    private Deque<Integer> maxStack;
    private Deque<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        maxStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        maxStack.push(x);
        // 保证存的时候 minStack 至始至终是最小
        if (minStack.isEmpty() || minStack.peek() >= x) { // 注意此处的 >= , 如果有重复元素, 那么 = 是必要的
            minStack.push(x);
        }
    }

    public void pop() {
        int t = maxStack.pop();
        // 如果 minStack 栈顶和 maxStack 栈顶相同, 那么一并移除
        if (t == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (maxStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        return maxStack.peek();
    }

    public int min() {
        if (minStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.min();
 */
