package xin.lingchao.java.leetcode.math._0412;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean devide3 = i % 3 == 0;
            boolean devide5 = i % 5 == 0;

            if (devide3 && devide5) {
                res.add("FizzBuzz");
            } else if (devide3) {
                res.add("Fizz");
            } else if (devide5) {
                res.add("Buzz");
            } else {
                res.add(i + "");
            }
        }

        return res;
    }
}
