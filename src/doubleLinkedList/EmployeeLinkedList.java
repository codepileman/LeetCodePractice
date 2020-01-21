package doubleLinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null){
            tail = node;
        }else{
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null){
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }



    public EmployeeNode removeFromFront(){
        if (head == null){
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null){
            tail = null;
        } else{
            EmployeeNode newHead = head.getNext();
            newHead.setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if (head == null){
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null){
            head = null;
        }else {
            EmployeeNode newTail = tail.getPrevious();
            newTail.setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
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
