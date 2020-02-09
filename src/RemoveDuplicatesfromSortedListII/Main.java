package RemoveDuplicatesfromSortedListII;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class Main {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode cur = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode previousNode = dummy;

        while(cur != null){

            while(cur.next != null && cur.next.val == previousNode.next.val){
                cur = cur.next;
            }

            if(previousNode.next == cur){
                previousNode = previousNode.next;
            }else{
                previousNode.next = cur.next;
            }

            cur = cur.next;

        }

        return dummy.next;
    }
}
