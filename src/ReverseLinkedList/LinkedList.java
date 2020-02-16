package ReverseLinkedList;



public class LinkedList {
//    Node head;
//
//    public void add(Node node){
//        if(head == null){
//            head = node;
//
//        }else {
//            Node currentNode =  head;
//            while(currentNode.next != null){
//                currentNode = currentNode.next;
//            }
//
//            currentNode.next = node;
//        }
//    }
//
//    public Node reverseList(Node head){
//        if(head == null || head.next == null){
//            return head;
//        }
//
//        Node newHead = reverseList(head.next);
//
//        head.next.next = head;
//        head.next = null;
//
//        return newHead;
//
//
//    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;

        while(cur != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            if(cur != null){
                next = cur.next;
            }

        }

        return prev;
    }
}
