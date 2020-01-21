package DFS_List;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    boolean visited;
    List<Node> neighbours;

    Node(int data){
        this.data = data;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbours(Node node){
        this.neighbours.add(node);
    }

    public List<Node> getNeighbours(){
        return this.neighbours;
    }

    public void setNeighbours(List<Node> neighbours){
        this.neighbours = neighbours;
    }


}
