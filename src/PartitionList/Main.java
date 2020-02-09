package PartitionList;



public class Main {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode partition(ListNode head, int x) {

        //use two pointers

        ListNode dummy1Head = new ListNode(-1);
        ListNode dummy1 = dummy1Head;


        ListNode dummy2Head = new ListNode(-1);
        ListNode dummy2 = dummy2Head;

        while(head != null){
            if(head.val < x){
                dummy1.next = head;
                dummy1 = dummy1.next;
            }else{
                dummy2.next = head;
                dummy2 = dummy2.next;
            }
            head = head.next;
        }

        dummy2.next = null;

        dummy1.next = dummy2Head.next;

        return dummy1Head.next;

    }
}
