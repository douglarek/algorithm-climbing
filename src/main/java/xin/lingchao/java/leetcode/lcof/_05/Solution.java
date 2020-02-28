package xin.lingchao.java.leetcode.lcof._05;

/**
 *
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * <b>示例 1：</b>
 *
 * <pre>
 * {@code
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * }
 * </pre>
 *
 * <p>
 *
 * See <a href=
 * "https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/">https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/</a>
 */
class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
        // return s.replace(" ", "%20");
    }
}
