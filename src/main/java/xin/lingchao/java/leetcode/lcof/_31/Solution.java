package xin.lingchao.java.leetcode.lcof._31;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 *
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列
 * {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 * <p>
 * <b>示例 1：</b>
 *
 * <pre>
 * {@code
 * 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * 输出：true
 * 解释：我们可以按以下顺序执行：
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * }
 * </pre>
 *
 * <p>
 *
 * <b>示例 2：</b>
 *
 * <pre>
 * {@code
 * 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * 输出：false
 * 解释：1 不能在 2 之前弹出。
 * }
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/">https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/</a>
 */
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();

        int N = pushed.length, j = 0;
        for (int i = 0; i < N; i++) {
            stack.push(pushed[i]); // 添加 pushed 元素到辅助栈
            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) { // 将 辅助栈栈顶元素和 popped
                                                                             // 比对, 并移动位置指针，
                                                                             // 如果相同则出栈.
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty(); // 辅助栈为空则序列合法
    }
}
