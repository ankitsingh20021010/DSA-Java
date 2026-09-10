# Graph in Java

A **Graph** is a non-linear data structure used to represent relationships or connections between different objects.

A graph consists of:

* **Vertices (Nodes):** The individual elements of a graph.
* **Edges:** The connections between two vertices.

## Example

```text
0 ---- 1
|      |
|      |
2 ---- 3
```

Here:

* `0, 1, 2, 3` are vertices.
* The lines between them are edges.

## Types of Graphs

### 1. Undirected Graph

In an undirected graph, edges do not have a direction.

```text
0 ---- 1
```

This means `0` is connected to `1`, and `1` is also connected to `0`.

### 2. Directed Graph

In a directed graph, edges have a specific direction.

```text
0 ----> 1
```

This means there is a connection from `0` to `1`.

## Graph Representation

Graphs are commonly represented using:

1. **Adjacency Matrix**
2. **Adjacency List**

### Adjacency List

An adjacency list stores the connected vertices for each vertex.

Example:

```text
0 -> 1 2
1 -> 0 3
2 -> 0 3
3 -> 1 2
```

## Java Implementation

```java
import java.util.*;

public class GraphAdjacencyList {

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create an empty list for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);

        // Display the graph
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }

    // Add an edge to an undirected graph
    static void addEdge(
            ArrayList<ArrayList<Integer>> graph,
            int u,
            int v) {

        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
```

## Output

```text
0 -> 1 2
1 -> 0 3
2 -> 0 3
3 -> 1 2
```

## Key Points

* A graph contains **vertices and edges**.
* Graphs are useful for representing relationships.
* **Adjacency List** is memory-efficient for sparse graphs.
* **Adjacency Matrix** is useful when quick edge lookup is required.
* Graphs are widely used in maps, social networks, computer networks, routing systems, and recommendation systems.

## Common Graph Algorithms

Some important graph algorithms are:

* Breadth First Search (BFS)
* Depth First Search (DFS)
* Dijkstra's Algorithm
* Bellman-Ford Algorithm
* Floyd-Warshall Algorithm
* Kruskal's Algorithm
* Prim's Algorithm

## Repository

This folder contains Java programs for learning and practicing **Graph Data Structures and Algorithms**.
