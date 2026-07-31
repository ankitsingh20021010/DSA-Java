
public class SinglyLinkedList {
    Node head=null;
    Node tail=null;
   static class Node{
    int data;
    Node next;
     Node(int data){
        this.data=data;
     }
   }
   int range(){
    int count=0;
    Node temp=head;
    if(head==null){
     return 0;
    }
    while(temp!=null){
        count++;
        temp=temp.next;
    }
     return count;
   }
   void display(){
      Node temp=head;
      if(head==null){
        System.out.println("List empty");
        return;
      }
      while(temp!=null){
         System.out.print(temp.data + " --->");
         temp=temp.next;
      }
   }
 void addFirst(int data){
    Node newNode = new Node(data);
   
    if(head==null){
        head=newNode;
        tail = newNode;
        return;
        
    }
    else{
       
        newNode.next=head;
        head=newNode;
    }
 }
   public static void main(String[] args) {
    SinglyLinkedList ll=new SinglyLinkedList();
    Node list1=new Node(5);
    ll.head=list1;
    ll.tail=list1;
    ll.addFirst(10);
    ll.addFirst(15);
    ll.addFirst(20);
    int size = ll.range();
    ll.display();

    System.out.println(" and their size is "+size);
    // Node list2=ll.new Node(6);
    // Node list3=ll.new Node(7);
    
   }
    
}
