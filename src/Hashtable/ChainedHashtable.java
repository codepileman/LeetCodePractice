package Hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length ; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(iterator.hasNext()){
            storedEmployee = iterator.next();
            if(storedEmployee.key.equals(key)){
                return storedEmployee.employee;
            }
        }

        return null;

    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(iterator.hasNext()){
            storedEmployee = iterator.next();
            if(storedEmployee.key.equals(key)){
                StoredEmployee temp = storedEmployee;
                hashtable[hashedKey].remove(storedEmployee);
                return temp.employee;
            }
        }
        return null;
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length ; i++) {
            if(hashtable[i].isEmpty()){
                System.out.println("Position " + i + ": empty");
            }else{
                System.out.println("Position " + i + ":");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next().employee);
                }

            }
        }
    }
}
