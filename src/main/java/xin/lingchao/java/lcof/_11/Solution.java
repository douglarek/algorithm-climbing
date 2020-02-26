package xin.lingchao.java.lcof._11;

class Solution {
    public int minArray(int[] numbers) {
        // int N = numbers.length;

        // for (int i = 0; i < N - 1; i++) {
        // if (numbers[i] > numbers[i + 1]) {
        // return numbers[i + 1];
        // }
        // }
        // return N == 0 ? 0 : numbers[0];
        //
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                // 去重
                j--;
            }
        }
        return numbers.length == 0 ? 0 : numbers[i];
    }
}
