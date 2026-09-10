# Breadth First Search (BFS)

Breadth First Search (BFS) is a graph traversal algorithm used to visit all vertices of a graph level by level.

BFS uses a **Queue** data structure.

## How BFS Works

1. Start from a selected vertex.
2. Mark the vertex as visited.
3. Add it to the queue.
4. Remove a vertex from the queue.
5. Visit all its unvisited adjacent vertices.
6. Add the newly visited vertices to the queue.
7. Repeat until the queue becomes empty.

## Example

```text
       0
      / \
     1   2
    / \
   3   4
```

Starting from `0`:

```text
BFS: 0 1 2 3 4
```

## Time Complexity

```text
O(V + E)
```

Where:

* `V` = Number of vertices
* `E` = Number of edges

## Space Complexity

```text
O(V)
```

## Applications

* Finding the shortest path in an unweighted graph
* Level-order traversal
* Finding connected components
* Web crawling
* Network broadcasting
