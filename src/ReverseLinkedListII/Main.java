package ReverseLinkedListII;

import java.util.Stack;

class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Main {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n || head == null){
           return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = null;
        ListNode third = null;


        for (int i = 1; i < m ; i++) {
            pre = pre.next;
        }

        cur = pre.next;

        for (int i = 0; i < n - m; i++) {
            third = cur.next;
            cur.next = third.next;
            third.next = pre.next;
            pre.next = third;
        }


        return dummy.next;

    }
}
