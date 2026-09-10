# Bellman-Ford Algorithm

The Bellman-Ford Algorithm is a shortest-path algorithm used to find the shortest distance from a source vertex to all other vertices.

Unlike Dijkstra's Algorithm, Bellman-Ford can handle **negative edge weights**.

It can also detect **negative weight cycles**.

## How Bellman-Ford Works

1. Set the source distance to `0`.
2. Set all other distances to infinity.
3. Relax every edge.
4. Repeat the relaxation process `V - 1` times.
5. Perform one additional iteration.
6. If any distance can still be reduced, the graph contains a negative weight cycle.

## Time Complexity

```text
O(V × E)
```

## Space Complexity

```text
O(V)
```

## Advantages

* Supports negative edge weights.
* Can detect negative weight cycles.
* Simple to implement.

## Applications

* Network routing
* Financial modeling
* Graph optimization
* Shortest-path problems with negative weights

## Dijkstra vs Bellman-Ford

| Feature                  | Dijkstra | Bellman-Ford        |
| ------------------------ | -------- | ------------------- |
| Negative edges           | No       | Yes                 |
| Negative cycle detection | No       | Yes                 |
| Time Complexity          | Faster   | Slower              |
| Approach                 | Greedy   | Dynamic Programming |
