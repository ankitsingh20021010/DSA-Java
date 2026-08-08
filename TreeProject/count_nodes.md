# Count Nodes in a Binary Tree

## Definition

Counting nodes means finding the total number of nodes present in a binary tree.

Every node in the tree is counted, including the root node and leaf nodes.

## Example

Consider the following binary tree:

        1
       / \
      2   3
     / \
    4   5

Total Nodes = 5

## Logic

To count the nodes:

1. If the tree is empty, return `0`.
2. Count the current node as `1`.
3. Recursively count nodes in the left subtree.
4. Recursively count nodes in the right subtree.
5. Add all three results.

### Formula

```text
Count = 1 + Count(Left) + Count(Right)
