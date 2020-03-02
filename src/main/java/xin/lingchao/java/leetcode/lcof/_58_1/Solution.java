package xin.lingchao.java.leetcode.lcof._58_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student.
 * "，则输出"student. a am I"。
 * <p>
 * <b>示例 1：</b>
 * <p>
 *
 * <pre>
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/">https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/</a>
 */
class Solution {
    public String reverseWords(String s) {
        List<String> res = Arrays.asList(s.trim().split("\\s+")); // 去除前后空格后按空格分拆
        Collections.reverse(res); // 逆序
        return res.stream().collect(Collectors.joining(" ")); // join
    }
}
