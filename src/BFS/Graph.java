package BFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private Queue<Node> queue;

    public Graph() {
        queue = new LinkedList<Node>();
    }

    public void bfs(Node node){
        queue.add(node);
        node.visited = true;
        while(!queue.isEmpty()){
            Node element = queue.remove();
            System.out.println(element.data + "t");
            List<Node> neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size() ; i++) {
                Node n = neighbours.get(i);
                if(n!=null && !n.visited){
                    queue.add(n);
                    n.visited = true;
                }
            }
        }
    }


}
