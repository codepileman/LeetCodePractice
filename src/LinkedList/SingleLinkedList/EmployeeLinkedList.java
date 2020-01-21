package LinkedList.SingleLinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if (head == null){
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void printList(){
        EmployeeNode tempNode = head;
        while(tempNode != null){
            Employee tempEmployee = tempNode.getEmployee();
            System.out.println(tempNode);
            tempNode = tempNode.getNext();
        }
    }
}
