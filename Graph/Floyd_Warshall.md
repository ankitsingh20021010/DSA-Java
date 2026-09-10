# Floyd-Warshall Algorithm

The Floyd-Warshall Algorithm is an **all-pairs shortest path algorithm**.

It finds the shortest paths between **every pair of vertices** in a weighted graph.

It uses the **Dynamic Programming** approach.

## How It Works

The algorithm checks whether using an intermediate vertex provides a shorter path between two vertices.

The main idea is:

```text
distance[i][j] =
min(distance[i][j],
    distance[i][k] + distance[k][j])
```

Where:

* `i` = Source vertex
* `j` = Destination vertex
* `k` = Intermediate vertex

## Time Complexity

```text
O(V³)
```

## Space Complexity

```text
O(V²)
```

## Advantages

* Finds shortest paths between every pair of vertices.
* Simple matrix-based implementation.
* Can work with negative edge weights.

## Important Note

Floyd-Warshall can detect negative cycles, but it should not be used when a valid shortest path is required in the presence of a negative cycle.

## Applications

* Network routing
* Transportation systems
* Graph analysis
* Finding shortest paths between all locations
