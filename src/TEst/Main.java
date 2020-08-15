package TEst;


import java.util.ArrayList;
import java.util.Arrays;
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
//        Human human = new Human();
//        List<Object> humans = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList();
        for(int i=0; i<3; i++){
            graph.get(i).set(i, i);
        }

        Arrays.toString(graph.toArray());

    }

}
