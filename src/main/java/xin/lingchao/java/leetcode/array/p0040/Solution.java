package xin.lingchao.java.leetcode.array.p0040;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;


// 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
//
//  
//
// 示例 1：
//
// 输入：arr = [3,2,1], k = 2
// 输出：[1,2] 或者 [2,1]
// 示例 2：
//
// 输入：arr = [0,1,2,1], k = 1
// 输出：[0]
//  
//
// 限制：
//
// 0 <= k <= arr.length <= 10000
// 0 <= arr[i] <= 10000
//
// 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }

        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        int j = partition(nums, lo, hi);

        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }

        return j > k ? quickSearch(nums, lo, j - 1, k) : quickSearch(nums, j + 1, hi, k);
    }

    private int random(int lo, int hi) {
        Random r = new Random();
        return r.nextInt(hi - lo + 1) + lo;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int partition(int[] nums, int lo, int hi) {
        int ri = random(lo, hi);
        swap(nums, ri, lo);

        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] > v);
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }

        swap(nums, lo, j);
        return j;
    }

    // 大根堆解法
    public int[] getLeastNumbers0(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }

        // 默认是小根堆, 实现大根堆需要重写一下比较器
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : arr) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num < pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        return pq.stream().mapToInt(i -> i).toArray();
    }
}
