package SwapPairs;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class Main {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null && current.next.next != null){
            ListNode first_node = current.next;
            ListNode second_node = current.next.next;

            first_node.next = second_node.next;
            current.next = second_node;

            second_node.next = first_node;

            current = current.next.next;
        }

        return dummy.next;

    }
}
