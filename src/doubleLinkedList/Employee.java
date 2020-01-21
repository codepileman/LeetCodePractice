package doubleLinkedList;

public class Employee {
    public String firstName;
    public String lastName;
    public int workId;

    public Employee(String firstName, String lastName, int workId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workId = workId;
    }

    public String toString(){
        return firstName + lastName + workId;
    }
}
