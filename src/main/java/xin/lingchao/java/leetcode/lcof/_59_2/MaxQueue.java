package xin.lingchao.java.leetcode.lcof._59_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front
 * 的时间复杂度都是O(1)。
 * <p>
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 * <p>
 * <b>示例 1：</b>
 *
 * <pre>
 * 输入:
 * ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
 * [[],[1],[2],[],[],[]]
 * 输出: [null,null,null,2,1,2]
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/">https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/</a>
 */
class MaxQueue {
    private Queue<Integer> queue; // 正常队列存储
    private Deque<Integer> maxQueue; // 单调递减队列, 头部到尾部依次递减

    public MaxQueue() {
        queue = new ArrayDeque<>();
        maxQueue = new ArrayDeque<>();
    }

    public int max_value() {
        if (maxQueue.isEmpty()) {
            return -1;
        }
        return maxQueue.peek();

    }

    /* 关键 */
    public void push_back(int value) {
        queue.add(value);
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {// 单调递减, 栈明显不合适的, 和尾部比较, 如果大于尾部元素, 则尾部元素出列,
                                                                    // 一直找尾部元素大于 value 的元素停止
            maxQueue.pollLast();
        }
        maxQueue.add(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int top = queue.poll();
        if (top == maxQueue.peek()) {
            maxQueue.poll();
        }
        return top;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such: MaxQueue obj =
 * new MaxQueue(); int param_1 = obj.max_value(); obj.push_back(value); int
 * param_3 = obj.pop_front();
 */
