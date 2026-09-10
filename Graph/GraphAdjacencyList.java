import java.util.*;

public class GraphAdjacencyList {

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create empty list for each vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);

        // Display graph
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }

    // Add edge for undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
