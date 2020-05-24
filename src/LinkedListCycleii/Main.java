package LinkedListCycleii;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Main {
    public ListNode detectCycle(ListNode head) {
        //this guy has a good explanation
        //https://github.com/RodneyShag/LeetCode_solutions/blob/master/Solutions/Linked%20List%20Cycle%20II.md

        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode newNode = head;
                while(newNode != slow){
                    newNode = newNode.next;
                    slow = slow.next;
                }

                return slow;
            }


        }

        return null;
    }
}
