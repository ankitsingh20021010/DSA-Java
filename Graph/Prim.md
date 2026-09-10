# Prim's Algorithm

Prim's Algorithm is a **Minimum Spanning Tree (MST)** algorithm.

It finds a minimum-cost set of edges that connects all vertices of a weighted, undirected graph without creating cycles.

## How Prim's Algorithm Works

1. Start from any vertex.
2. Mark it as visited.
3. Find the minimum-weight edge connecting a visited vertex to an unvisited vertex.
4. Add that edge to the MST.
5. Mark the new vertex as visited.
6. Repeat until all vertices are included.

## Example

```text
       2
   0 ----- 1
   |       |
  3|       |1
   |       |
   2 ----- 3
       2
```

Prim's Algorithm gradually grows the MST from a starting vertex.

## Time Complexity

Using a priority queue:

```text
O((V + E) log V)
```

## Space Complexity

```text
O(V + E)
```

## Applications

* Network design
* Road construction
* Telecommunication networks
* Electrical networks
* Minimum-cost connection problems

## Prim vs Kruskal

| Feature         | Prim           | Kruskal                       |
| --------------- | -------------- | ----------------------------- |
| Approach        | Grows one tree | Builds MST using sorted edges |
| Starting vertex | Required       | Not required                  |
| Cycle detection | Implicit       | DSU                           |
| Best suited for | Dense graphs   | Sparse graphs                 |
