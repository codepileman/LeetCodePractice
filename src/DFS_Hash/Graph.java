package DFS_Hash;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private HashMap<Node, LinkedList<Node>> adjacencyMap;
    private boolean directed;

    public Graph(boolean directed) {
        this.directed = directed;
        adjacencyMap = new HashMap<>();
    }

    public void addEdgeHelper(Node a, Node b){
        LinkedList<Node> tmp = adjacencyMap.get(a);
        if( tmp != null){
            tmp.remove(b);
        }else {
            tmp = new LinkedList<>();
        }
        tmp.add(b);
        adjacencyMap.put(a, tmp);

    }

    public void addEdge(Node source, Node des){
        if(!adjacencyMap.keySet().contains(source)){
            adjacencyMap.put(source, null);
        }
        if(!adjacencyMap.keySet().contains(des)){
            adjacencyMap.put(des, null);
        }

        addEdgeHelper(source, des);
        if(!directed){
            addEdgeHelper(des, source);
        }
    }

    public void printEdge(){
        for(Node node : adjacencyMap.keySet()){
            System.out.println("The " + node.name + "has an edge towards: ");
            for(Node neighbor : adjacencyMap.get(node)){
                System.out.println(neighbor.name + " ");
            }

            System.out.println();
        }
    }

    public boolean hasEdge(Node source, Node des){
        return adjacencyMap.containsKey(source) && adjacencyMap.get(source).contains(des);
    }

    public void dfs(Node node){
        node.visit();
        System.out.println(node.name + " ");
        LinkedList<Node> neighbors =  adjacencyMap.get(node);
        if(neighbors == null){
            return;
        }
        for(Node n : neighbors){
            if(!n.visited){
                dfs(n);
            }

        }
    }
}
