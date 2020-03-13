package xin.lingchao.java.leetcode.binary_search.p0278;

/**
 * 278. 第一个错误的版本
 *
 * <p>
 * See <a href="https://leetcode-cn.com/problems/first-bad-version/">https://leetcode-cn.com/problems/first-bad-version/</a>
 * */
public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        //     int min = 0;
        //     int i = 1;
        //     while (i <= n) {
        //         int mid = (n + i) >>> 1;
        //         if (isBadVersion(mid)) {
        //             if (n != 0 || mid < min) {
        //                 min = mid;
        //             }
        //             n = mid - 1;
        //         } else {
        //             i = mid + 1;
        //         }
        //     }
        //     return min; // 其实这个地方可以直接 return i
        int i = 1;
        while (i <= n) {
            int mid = (n + i) >>> 1;
            if (isBadVersion(mid)) {
                n = mid - 1;
            } else {
                i = mid + 1;
            }

        }
        return i;
    }
}


// 真实的定义存在于 leetcode 测试中,
// 此处纯属骗 java 编译器.
class VersionControl {
    boolean isBadVersion(int version) {
        return false;
    }
}
