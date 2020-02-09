package RemoveDuplicatesfromSortedList;

public class Main {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        //head is the first element of the list
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }

        }

        return head;


    }
}
