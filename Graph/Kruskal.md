# Kruskal's Algorithm

Kruskal's Algorithm is a **Minimum Spanning Tree (MST)** algorithm.

It finds a set of edges that connects all vertices with the minimum possible total edge weight without creating a cycle.

Kruskal's Algorithm is mainly used for **weighted, undirected graphs**.

## How Kruskal's Algorithm Works

1. Sort all edges by their weight.
2. Select the edge with the smallest weight.
3. Check whether adding the edge creates a cycle.
4. If it does not create a cycle, add it to the MST.
5. Continue until the MST contains `V - 1` edges.

## Example

```text
Edges:

0 --1-- 1
1 --2-- 2
0 --3-- 2
1 --4-- 3
```

The algorithm selects the minimum-weight edges while avoiding cycles.

## Time Complexity

```text
O(E log E)
```

## Space Complexity

```text
O(V + E)
```

## Important Concept

Kruskal's Algorithm commonly uses the **Disjoint Set Union (DSU)** data structure to detect cycles efficiently.

## Applications

* Network design
* Connecting computer networks
* Road construction
* Electrical grid design
* Minimum-cost connection problems
