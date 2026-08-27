public class BSTSearch {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Insert node into BST
    public static Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Search value in BST
    public static boolean search(Node root, int key) {

        // Value not found
        if (root == null) {
            return false;
        }

        // Value found
        if (root.data == key) {
            return true;
        }

        // Search left subtree
        if (key < root.data) {
            return search(root.left, key);
        }

        // Search right subtree
        return search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        int key = 60;

        if (search(root, key)) {
            System.out.println(key + " found in BST");
        } else {
            System.out.println(key + " not found in BST");
        }
    }
}
