# Tree Traversals in Java

Tree traversal is the process of visiting every node in a tree exactly once in a specific order. The three most common depth-first traversal methods are Inorder, Preorder, and Postorder.

---

## 1. Inorder Traversal (Left → Root → Right)

### Definition

In Inorder traversal, the left subtree is visited first, then the root node, and finally the right subtree.

### Algorithm

1. Traverse the left subtree.
2. Visit the root node.
3. Traverse the right subtree.

### Example

```
      A
     / \
    B   C
   / \
  D   E
```

**Traversal Output:**

```
D B E A C
```

### Time Complexity

* **O(n)**

### Space Complexity

* **O(h)** (where *h* is the height of the tree)

---

## 2. Preorder Traversal (Root → Left → Right)

### Definition

In Preorder traversal, the root node is visited first, followed by the left subtree and then the right subtree.

### Algorithm

1. Visit the root node.
2. Traverse the left subtree.
3. Traverse the right subtree.

### Example

```
      A
     / \
    B   C
   / \
  D   E
```

**Traversal Output:**

```
A B D E C
```

### Time Complexity

* **O(n)**

### Space Complexity

* **O(h)**

---

## 3. Postorder Traversal (Left → Right → Root)

### Definition

In Postorder traversal, the left subtree is visited first, then the right subtree, and finally the root node.

### Algorithm

1. Traverse the left subtree.
2. Traverse the right subtree.
3. Visit the root node.

### Example

```
      A
     / \
    B   C
   / \
  D   E
```

**Traversal Output:**

```
D E B C A
```

### Time Complexity

* **O(n)**

### Space Complexity

* **O(h)**

---

# Comparison Table

| Traversal | Order               | Example Output |
| --------- | ------------------- | -------------- |
| Inorder   | Left → Root → Right | D B E A C      |
| Preorder  | Root → Left → Right | A B D E C      |
| Postorder | Left → Right → Root | D E B C A      |

---
## Applications
* **Inorder:** Used in Binary Search Trees to print elements in sorted order.
* **Preorder:** Used to create a copy of a tree and represent its structure.
* **Postorder:** Used to delete a tree and evaluate expression trees.

---
## Conclusion

Tree traversals are essential operations for accessing or processing all nodes of a tree. Choosing the appropriate traversal method depends on the application's requirements.
