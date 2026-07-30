# Linked List

## What is a Linked List?

A Linked List is a linear data structure in which elements are stored in the form of nodes.
Each node contains:

1. Data
2. Reference (Pointer) to the next node

Unlike arrays, linked list elements are not stored in contiguous memory locations.

---

## Real Life Example

Imagine a train.

Engine -> Coach1 -> Coach2 -> Coach3 -> Null

Each coach knows only the next coach.

Linked List works in the same way.

---

## Structure of a Node

```
+-------+--------+
| Data  |  Next  |
+-------+--------+
```

Example

```
10 -> 20 -> 30 -> 40 -> NULL
```

---

## Java Representation

```java
class Node {
    int data;
    Node next;
}
```

---

## Types of Linked List

### 1. Singly Linked List

```
10 -> 20 -> 30 -> NULL
```

Traversal is only forward.

---

### 2. Doubly Linked List

```
NULL <- 10 <-> 20 <-> 30 -> NULL
```

Traversal can be done in both directions.

---

### 3. Circular Linked List

```
10 -> 20 -> 30
^            |
|____________|
```

The last node points back to the first node.

---

# Advantages

- Dynamic size
- Easy insertion
- Easy deletion
- Efficient memory allocation

---

# Disadvantages

- Extra memory required for pointer
- No direct indexing
- Slower access than arrays

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| Insert at Beginning | O(1) |
| Insert at End | O(n) |
| Insert at Position | O(n) |
| Delete | O(n) |
| Search | O(n) |
| Reverse | O(n) |
| Display | O(n) |

---

# Applications

- Music Playlist
- Browser History
- Undo/Redo
- Image Viewer
- Memory Management
- LRU Cache
- Graph Implementation

---

# Interview Questions

- What is Linked List?
- Why use Linked List instead of Array?
- Difference between Array and Linked List?
- What is a Node?
- Why is insertion O(1) at the beginning?
- Difference between Singly and Doubly Linked List?
- What is Circular Linked List?
- How do you reverse a Linked List?

---

# Folder Contents

```
02-LinkedList/

├── ABOUT.md
├── Node.java
├── SinglyLinkedList.java
├── Operations/
│   ├── InsertAtBeginning.java
│   ├── InsertAtEnd.java
│   ├── Delete.java
│   ├── Reverse.java
│   └── Search.java
│
└── Questions/
    ├── ReverseLinkedList.java
    ├── DetectLoop.java
    ├── FindMiddle.java
    └── MergeTwoLists.java
```

---

# Learning Outcome

After completing this folder you should be able to:

- Create a Node
- Build a Linked List
- Insert nodes
- Delete nodes
- Search elements
- Reverse a Linked List
- Solve interview problems based on Linked Lists
