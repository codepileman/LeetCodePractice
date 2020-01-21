package DFS_List;

import java.util.List;
import java.util.Stack;

public class Main {
    public static void dfs(Node node){
        System.out.println(node.data + " ");
        List<Node> neighbours = node.getNeighbours();

        node.visited = true;
        for (int i = 0; i < neighbours.size(); i++) {
            Node nb = neighbours.get(i);
            if(nb != null && !nb.visited){
                dfs(nb);
            }
        }



    }

    public static void dfsStack(Node node){
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        while (!stack.isEmpty()){
            Node ele = stack.pop();
            if(!ele.visited){
                System.out.println(ele.data);
                ele.visited = true;
            }

            List<Node> neighbours = node.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if(n!=null && !n.visited){
                    stack.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);


        node40.addNeighbours(node10);
        node40.addNeighbours(node20);
        node10.addNeighbours(node30);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node60);
        node20.addNeighbours(node50);
        node30.addNeighbours(node60);
        node60.addNeighbours(node70);
        node50.addNeighbours(node70);

        System.out.println("The DFS traversal of the graph using recursion ");
        dfs(node10);

        node40.visited=false;
        node10.visited=false;
        node20.visited=false;
        node30.visited=false;
        node60.visited=false;
        node50.visited=false;
        node70.visited=false;

        System.out.println("The DFS traversal of the graph using stack ");
        dfsStack(node10);


    }

}
