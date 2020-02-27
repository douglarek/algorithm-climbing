package xin.lingchao.java.leetcode.lcof._03;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            if (s.contains(i)) {
                return i;
            } else {
                s.add(i);
            }
        }

        return -1;
    }
}
