package DFS_Hash;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(false);
        Node a = new Node(0, "1");
        Node b = new Node(1, "2");
        Node c = new Node(2, "3");
        Node d = new Node(3, "4");
        Node e = new Node(5, "5");
        Node f = new Node(6, "6");
        Node g = new Node(7, "7");


        graph.addEdge(a,b);
        graph.addEdge(a,c);
        graph.addEdge(a,d);
        graph.addEdge(b,c);
        graph.addEdge(b,d);
        graph.addEdge(b,e);
        graph.addEdge(b,f);
        graph.addEdge(c,f);
        graph.addEdge(e,g);
        graph.addEdge(f,g);

        graph.dfs(d);
    }
}
