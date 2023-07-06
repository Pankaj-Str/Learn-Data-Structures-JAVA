# Graph Data Structure

In computer science and graph theory, a graph is a data structure that represents a collection of interconnected nodes or vertices. It consists of a set of vertices and a set of edges that connect these vertices.

There are two common ways to represent a graph: adjacency matrix and adjacency list. In this explanation, I'll focus on the adjacency list representation.

In Java, you can implement a graph using the adjacency list representation using the following steps:

 1. Start by creating a Graph class. This class will have instance variables to store the number of vertices and an adjacency list.

 2. The constructor of the Graph class should take the number of vertices as a parameter. It initializes the adjacency list as an empty list with a size equal to the number of vertices.

 3. Create a method called addEdge(source, destination) to add an edge between two vertices. This method takes the source and destination vertices as parameters. It adds the destination vertex to the list of neighbors for the source vertex in the adjacency list.

 5. To implement graph traversal algorithms like Depth-First Search (DFS), you can create a method called DFS(startVertex) in the Graph class. This method performs the Depth-First Search algorithm on the graph starting from the given start vertex. It uses a stack to keep track of the vertices to visit.

 6. Inside the DFS method, initialize a boolean array called visited with a size equal to the number of vertices. This array is used to keep track of visited vertices during the traversal.

 7. Create a stack to store the vertices to visit. Push the start vertex onto the stack.

 8. While the stack is not empty, perform the following steps:
    
        1. Pop a vertex from the stack.
        2. If the vertex has not been visited, mark it as visited and process it.
        3. Print or perform any desired operation on the current vertex.
        4. Get the neighbors of the current vertex from the adjacency list and iterate over them.
        5. For each unvisited neighbor, push it onto the stack.

 10. In the Main class or any other class, create an instance of the Graph class and add edges to it using the addEdge method.

    Finally, call the DFS method on the Graph object with a starting vertex to perform the Depth-First Search traversal.

That's the general idea behind implementing a graph and performing graph traversal algorithms in Java. You can modify and extend the code according to your specific requirements.


Implementing a graph data structure in Java using the adjacency list representation:

```java
import java.util.ArrayList;
import java.util.List;
@p4n.in
//codeswithpankaj.com

class Graph {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Uncomment for undirected graph
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.get(vertex);
    }
}
```

In this example, we have a `Graph` class that represents the graph data structure using the adjacency list representation.

The constructor `Graph(int numVertices)` initializes the graph with the specified number of vertices. It creates an empty adjacency list with a size equal to the number of vertices.

The method `addEdge(int source, int destination)` adds an edge between two vertices. It adds the destination vertex to the adjacency list of the source vertex. If you want to represent an undirected graph, you can uncomment the second line, which adds the source vertex to the adjacency list of the destination vertex as well.

The method `getNeighbors(int vertex)` returns a list of neighbors for the given vertex.

You can create an instance of the `Graph` class, add edges using the `addEdge` method, and retrieve neighbors using the `getNeighbors` method.

Here's an example usage:

```java
public class Main {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        List<Integer> neighbors = graph.getNeighbors(1);
        System.out.println("Neighbors of vertex 1:");
        for (int neighbor : neighbors) {
            System.out.println(neighbor);
        }
    }
}
```

In this example, we create a graph with 5 vertices and add some edges. Then, we retrieve the neighbors of vertex 1 using the `getNeighbors` method and print them.

Output:
```
Neighbors of vertex 1:
0
3
4
```

The output shows the neighbors of vertex 1 in the graph.
