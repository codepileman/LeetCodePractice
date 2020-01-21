package ReverseLinkedList;

public class LinkedList {
    Node head;

    public void add(Node node){
        if(head == null){
            head = node;

        }else {
            Node currentNode =  head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }

            currentNode.next = node;
        }
    }

    public Node reverseList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;


    }
}
