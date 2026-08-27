public class FindMax {

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

    // Insert into BST
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

    // Find maximum value
    public static int findMax(Node root) {

        if (root == null) {
            throw new RuntimeException("BST is empty");
        }

        // Keep moving right
        while (root.right != null) {
            root = root.right;
        }

        return root.data;
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

        System.out.println("Maximum value: " + findMax(root));
    }
}
