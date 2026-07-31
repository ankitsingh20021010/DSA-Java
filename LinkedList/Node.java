public class Linked_list{
     Node head;
     Node tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
             this.data=data;
        }
     }

    public static void main(String[] args) {
        Linked_list ll = new Linked_list();
        Node list1 = new Node(4);
        Node list2 = new Node(5);
        ll.head=list1;

        list1.next=list2;
        System.out.print(list1.data + "-->");
        //data of list 1
        System.out.print(list1.next + "--> ");
        //address of list2
        System.out.print(list2 + " ->");
        //same "address of list2"
        System.out.print(list2.data +" --> Program end\n" );
        //data of list 2 means 5
         //finall output is  
         //data(4) ,add //address//data(5)
    }
}
