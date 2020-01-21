package doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones1 = new Employee("Jane1", "Jones", 123);
        Employee janeJones2 = new Employee("Jane2", "Jones", 123);
        Employee janeJones3 = new Employee("Jane3", "Jones", 123);
        Employee janeJones4 = new Employee("Jane4", "Jones", 123);


        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janeJones1);
        list.addToFront(janeJones2);
        list.addToFront(janeJones3);
        list.addToFront(janeJones4);



        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }


}
