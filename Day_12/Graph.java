package Day_12;
import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(int vertex) {
        adjList.put(vertex, new ArrayList<>());
    }

    // Add an edge between two vertices
    public void addEdge(int fromVertex, int toVertex) {
        if (!adjList.containsKey(fromVertex) || !adjList.containsKey(toVertex))
            throw new IllegalArgumentException("Invalid vertices");

        adjList.get(fromVertex).add(toVertex);
        adjList.get(toVertex).add(fromVertex); // For an undirected graph, remove this line for a directed graph
    }

    // Get all adjacent vertices of a given vertex
    public List<Integer> getAdjacentVertices(int vertex) {
        return adjList.get(vertex);
    }

    // Print the graph
    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            List<Integer> neighbors = adjList.get(vertex);
            System.out.print(vertex + " -> ");
            for (int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        
        graph.printGraph();
    }
}
