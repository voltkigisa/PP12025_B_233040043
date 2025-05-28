package pertemuan13;

public class GraphMain {
    public static void main(String[] args) {
        Graph latihan5 = new Graph(5); // Create a graph with a maximum of 5 vertices
        Graph latihan6 = new Graph(4); // Graph with 4 vertices
 
        latihan5.addVertex('A'); // Add vertex A mulai dari 0
        latihan5.addVertex('B'); // Add vertex B
        latihan5.addVertex('C'); // Add vertex C
        latihan5.addVertex('D'); // Add vertex D
        latihan5.addVertex('E'); // Add vertex E

        latihan5.addEdge(0, 1); // Connect A and B
        latihan5.addEdge(1, 2); // Connect B and C
        latihan5.addEdge(0, 3); // Connect C and D
        latihan5.addEdge(3, 4); // Connect D and E

        System.out.println("Adjacency Matrix1:");
        latihan5.adjecencyMatrix(); // Display adjacency matrix

        latihan6.addVertex('A'); // Add vertex A
        latihan6.addVertex('B'); // Add vertex B
        latihan6.addVertex('C'); // Add vertex C
        latihan6.addVertex('D'); // Add vertex D
        
        latihan6.addEdge(0, 1); // Connect A and B
        latihan6.addEdge(1, 3); // Connect B and D
        latihan6.addEdge(0, 3); // Connect A and D
        latihan6.addEdge(0, 2); // Connect C and D
        
        System.out.println("Adjacency Matrix2:");
        latihan6.adjecencyMatrix(); // Display adjacency matrix
    }
}
