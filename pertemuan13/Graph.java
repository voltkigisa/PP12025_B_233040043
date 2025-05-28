package pertemuan13;

public class Graph {
    private Vertex vertexList[];// Array of vertices
    private int adjMat[][]; // Adjacency matrix
    private int nVerts; // Current number of vertices

    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts]; // Create array of vertices
        adjMat = new int[maxVerts][maxVerts]; // Create adjacency matrix
        nVerts = 0; // Initialize number of vertices

        for (int j = 0; j < maxVerts; j++) { 
            for (int k = 0; k < maxVerts; k++) {
                adjMat[j][k] = 0;
            }
        }
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab); 
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1; 
        adjMat[end][start] = 1; 
    }

    public void adjecencyMatrix(){
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
