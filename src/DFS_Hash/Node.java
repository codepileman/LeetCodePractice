package DFS_Hash;

public class Node {
    int n;
    String name;
    boolean visited; // New attribute

    Node(int n, String name) {
        this.n = n;
        this.name = name;
        visited = false;
    }

    // Two new methods we'll need in our traversal algorithms
    void visit() {
        visited = true;
    }

    void unvisited() {
        visited = false;
    }
}
