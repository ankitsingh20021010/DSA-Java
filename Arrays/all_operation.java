//try to all array operations in data structure
import java.util.*;
public class all_operation{
    static void printarr(int[] arr){
        System.out.print("Array is: ");
        for(int i=0; i<arr.length; i++){ 
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
//cash2 at possition
      static void atpossition(int []arr, Scanner sc){
        System.out.print("Enter possition (1 to" + arr.length + ":)");
        int pos=sc.nextInt();
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        //possition sift
        for(int i=arr.length-1; i>pos; i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=num;
       printarr(arr);
      }
//cash3 insert start
 static int[] insert_start(int[] arr, Scanner sc){
    System.out.print("enter number:-");
    int num=sc.nextInt();
    int [] newArr=new int[arr.length + 1];
    newArr[0]=num;
    for(int i=0; i<arr.length; i++){
         newArr[i+1]=arr[i];
    }
    return newArr;
 }
 //delete element 
 static int[] delete_arr(int[] arr){
    int [] newarr=new int[arr.length-1];
    for(int i=0; i<arr.length-1; i++){
        newarr[i]= arr[i+1];
    }
    return newarr;

 }
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7,8};
     int i;
     do{ 
        System.out.println("1 for print array");
        System.out.println("2 for enter data at possition");
        System.out.println("3 for insert start possition");
        System.out.println("4 for Delete at start possition");
        System.out.print("enter number: ");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        switch (i) {
            case 1:
            printarr(arr);    
                break;
            case 2:
            atpossition(arr, sc);
                 break;
            case 3:
            arr=insert_start(arr,sc);
            printarr(arr);
                 break;
            case 4:
            arr=delete_arr(arr);
            printarr(arr);
            default: 
                break;
        }
        
     } while(i >0);

    }
}
