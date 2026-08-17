class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;  
    }
}
public class InsertAtEnd {
    static Node head;
    static void InsertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
        while (temp.next!=null){
           temp=temp.next;
        }
        temp.next=newNode;
    }
    static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"--->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    

    public static void main(String[] args) {
        InsertAtEnd(10);
        InsertAtEnd(20);
        InsertAtEnd(30);
        InsertAtEnd(40);
        display();
    }
}
