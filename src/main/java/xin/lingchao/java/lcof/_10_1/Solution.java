package xin.lingchao.java.lcof._10_1;

class Solution {
    public int fib(int n) {
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            long tmp = a;
            a = b;
            b = (tmp + b) % 1000000007;
        }

        return (int) a;
    }
}
