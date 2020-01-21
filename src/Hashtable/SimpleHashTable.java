package Hashtable;

public class SimpleHashTable {
    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        this.hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey+ 1) % hashtable.length;
            }


        }
        if (occupied(hashedKey)){
            System.out.println("Sorry, there is an employee at " + hashedKey);
        } else{
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        for (int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] != null && hashtable[i].key.equals(key)){
                StoredEmployee tobeRemoved = hashtable[i];
                hashtable[i] = null;
                return tobeRemoved.employee;
            }
        }

        return null;
    }

    private int findKey(String key){
        int hashedKey =  hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        for (int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] != null && hashtable[i].key.equals(key)){
                return i;
            }
        }

        return -1;

    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] == null){
                System.out.println("Empty");
            }else{
                System.out.println(hashtable[i].employee);
            }

        }
    }
}
