package challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        IntegerNode newNode = new IntegerNode(value);

        if (isEmpty() || head.getValue() >= value){
            addToFront(value);
            return;
        }
        IntegerNode currentNode = head.getNext();
        IntegerNode previousNode = head;
        while(currentNode != null ) {
            if (currentNode.getValue() >= value){
                previousNode.setNext(newNode);
                newNode.setNext(currentNode);
                size++;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();

        }

        previousNode.setNext(newNode);
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
