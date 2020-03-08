package xin.lingchao.java.leetcode.structure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode newInstance(int[] a) {
        ListNode dummy = new ListNode(0); // 哑节点
        ListNode head = dummy;

        for (int e : a) {
            head.next = new ListNode(e);
            head = head.next;
        }

        return dummy.next;
    }

    public void show() {
        ListNode head = this;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
