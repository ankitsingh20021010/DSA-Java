# Dijkstra's Algorithm

Dijkstra's Algorithm is a shortest-path algorithm used to find the shortest distance from a source vertex to all other vertices in a **weighted graph**.

It works with graphs that have **non-negative edge weights**.

## How Dijkstra's Algorithm Works

1. Select a source vertex.
2. Set its distance to `0`.
3. Set the distance of all other vertices to infinity.
4. Select the unvisited vertex with the smallest distance.
5. Update the distances of its adjacent vertices.
6. Mark the current vertex as visited.
7. Repeat until all required vertices are processed.

## Example

```text
      4
   0 ---- 1
   |      |
  2|      |1
   |      |
   2 ---- 3
      3
```

The algorithm calculates the minimum distance from the selected source vertex.

## Time Complexity

Using a priority queue:

```text
O((V + E) log V)
```

## Space Complexity

```text
O(V)
```

## Important Note

Dijkstra's Algorithm **does not work correctly with negative edge weights**.

## Applications

* GPS navigation
* Network routing
* Maps
* Shortest-path problems
* Transportation systems
