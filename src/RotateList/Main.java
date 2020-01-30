package RotateList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class Main {
    public ListNode rotateRight(ListNode head, int k) {

        if( head == null || head.next == null || k == 0) {
            return head;
        }


        ListNode firstPointer = head;
        ListNode secondPointer = head;

        int len = 1;

        while(secondPointer.next != null) {
            secondPointer = secondPointer.next;
            len++;
        }

        secondPointer = head;


        int steps = k % len;

        if (steps == 0) {
            return head;
        }

        for(int i = 0; i < steps; i++) {
            secondPointer = secondPointer.next;
        }

        while(secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        secondPointer.next = head;
        head = firstPointer.next;
        firstPointer.next = null;

        return head;

    }
}
