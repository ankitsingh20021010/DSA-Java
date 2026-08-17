class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtEnd {

    static Node head;
     static int maximum(Node head){
    int max=head.data;
    Node current=head;

    while(current!=null){
        if(current.data>max){
           max=current.data;
        }
        current=current.next;
    }
    return max;
}

    // Insert at End
    static void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert new node at end
        temp.next = newNode;
    }

    // Display Linked List
    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        insertAtEnd(80);

        display();
        int a=maximum(head);
        System.out.println(a+ " --> is max number");
    }
}
