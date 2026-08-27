public class BSTInsert {

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

    public static Node insert(Node root, int data) {

        // If tree is empty
        if (root == null) {
            return new Node(data);
        }

        // Insert in left subtree
        if (data < root.data) {
            root.left = insert(root.left, data);
        }

        // Insert in right subtree
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
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

        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}
