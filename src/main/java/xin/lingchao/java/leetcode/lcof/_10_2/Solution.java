package xin.lingchao.java.leetcode.lcof._10_2;


/**
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * <p>
 * See <a href=
 * "https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/">https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/</a>
 */
class Solution {
    public int numWays(int n) {

        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            long tmp = a;
            a = b;
            b = (tmp + b) % 1000000007; // 步进判断
        }

        return (int) b;

    }
}
