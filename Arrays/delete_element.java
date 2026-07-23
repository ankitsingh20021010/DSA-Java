import java.util.*;
class delete_element {
    public static void main(String[] args) {
       int[] arr={0,1,2,3,4,5,6,7};
       Scanner sc=new Scanner(System.in);
       int size= arr.length;
       System.out.print("Enter index num:-");
       int index= sc.nextInt();
       for(int i=index; i<size-1; i++){
           arr[i]=arr[i+1];
       }
       size--;
       for(int i=0; i<size; i++){
           System.out.print(arr[i]+ " ");
       }
       
       
    }
}
