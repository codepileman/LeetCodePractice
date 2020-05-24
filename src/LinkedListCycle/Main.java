package LinkedListCycle;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Main {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        //两个指针，快的如果追上慢的，就是有cycle。

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null) return false;

            fast = fast.next.next;
            slow = slow.next;


        }

        return true;

    }

}
