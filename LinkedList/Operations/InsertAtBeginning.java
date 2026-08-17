
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
} 
public class InsertAtBeginning {
    static Node head;

   static void  InsertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
  static void display(){
    Node temp=head;
    while (temp.next!=null) {
     System.out.print(temp.data+"-->");   
     temp=temp.next;

    }
     System.out.println("NULL");
  }

    public static void main(String[] args) {
InsertAtBeginning(120);
InsertAtBeginning(130);
InsertAtBeginning(140);
InsertAtBeginning(150);
display();
    }
    

}
