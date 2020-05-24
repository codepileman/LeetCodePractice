package TEst;


import java.util.ArrayList;
import java.util.List;

class Human{
    public void drink(){
        System.out.println("Drinking");
    }

    public void eating(){
        System.out.println("Eating");
    }

    public void sleeping(){
        System.out.println("Sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        List<Object> humans = new ArrayList<>();

    }

}
