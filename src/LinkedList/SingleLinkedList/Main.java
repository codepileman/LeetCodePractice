package LinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones1 = new Employee("Jane1", "Jones", 123);
        Employee janeJones2 = new Employee("Jane2", "Jones", 123);
        Employee janeJones3 = new Employee("Jane3", "Jones", 123);
        Employee janeJones4 = new Employee("Jane4", "Jones", 123);


        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones1);
        list.addToFront(janeJones2);
        list.addToFront(janeJones3);
        list.addToFront(janeJones4);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();

    }
}
