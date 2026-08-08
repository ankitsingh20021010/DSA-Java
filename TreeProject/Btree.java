public class Btree{
    static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left, data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
   static void postorder(Node root){
    if(root==null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
   }
    public static void main(String[] args) {
        Node root=null;
root = insert(root, 4);
root = insert(root, 2);
root = insert(root, 6);
root = insert(root, 1);
root = insert(root, 3);
root = insert(root, 9);
root = insert(root, 5);
root = insert(root, 7);
root = insert(root, 8);

        System.out.println(" data insert Success");
        inorder(root);
        System.out.println(" ");
        preorder(root);
        System.out.println(" ");
        postorder(root);
    }
}
