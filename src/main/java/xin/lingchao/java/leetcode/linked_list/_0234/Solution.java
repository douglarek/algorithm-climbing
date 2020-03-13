package xin.lingchao.java.leetcode.linked_list._0234;

import java.util.ArrayList;
import java.util.List;
import xin.lingchao.java.leetcode.structure.ListNode;

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            vals.add(curr.val);
            curr = curr.next;
        }

        int i = 0, j = vals.size() - 1;


        while (i < j) {
            if (!vals.get(i).equals(vals.get(j))) {
                return false;
            }
            i++;
            j--;
        }


        return true;
    }
}
