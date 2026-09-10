# Depth First Search (DFS)

Depth First Search (DFS) is a graph traversal algorithm that explores as far as possible along one branch before backtracking.

DFS can be implemented using **Recursion** or a **Stack**.

## How DFS Works

1. Start from a selected vertex.
2. Mark the vertex as visited.
3. Visit an unvisited adjacent vertex.
4. Continue exploring deeper.
5. Backtrack when no unvisited adjacent vertex is available.
6. Continue until all reachable vertices are visited.

## Example

```text
       0
      / \
     1   2
    / \
   3   4
```

Starting from `0`, one possible DFS traversal is:

```text
DFS: 0 1 3 4 2
```

## Time Complexity

```text
O(V + E)
```

## Space Complexity

```text
O(V)
```

## Applications

* Detecting cycles
* Finding connected components
* Topological sorting
* Path finding
* Solving maze problems
* Graph traversal
