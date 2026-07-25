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
//cash2 enter element at possition
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
    int [] newArr=new int[arr.length + 1]; //static array
    newArr[0]=num;
    for(int i=0; i<arr.length; i++){
         newArr[i+1]=arr[i];
    }
    return newArr; //after ruturn diynamic array
 }
 //delete element 
 static int[] delete_arr(int[] arr){
    int [] newarr=new int[arr.length-1];
    for(int i=0; i<arr.length-1; i++){
        newarr[i]= arr[i+1];
    }
    return newarr;
 }
 //search element
 static void search_arr(int[] arr,Scanner sc){
    System.out.print("Enter element:");
    int element=sc.nextInt();
    int flag=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==element){
            flag++; 
        }
    }
    if(flag==1){ 
        System.out.println();//output look diffrent easy to ready or underustand 
        System.out.println();
        System.out.println("Yes element "+ element+" is exist");
        System.out.println();
        System.out.println();
    }
    else{
        System.out.println();
        System.out.println("No elemet "+ element+" is not exist");
    }
 }
  //case:6 delete at end possition 
 static int[] deleteAtEnd(int[] arr){
    int[] newarr=new int[arr.length-1];
    for(int i=0; i<arr.length-1; i++){
        newarr[i]=arr[i];
    }
    return arr=newarr;
 }
 //case:7 add at end possition
 static int[] addAtend(int[] arr, Scanner sc){
    System.out.print("enter last element :");
    int num=sc.nextInt();
    int [] newarr=new int[arr.length+1];
    for(int i=0; i<arr.length; i++){
        newarr[i]=arr[i];
    }
    newarr[arr.length]=num;
    return newarr;
 }
 //main funtion start hear
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7,8};
     int i;
     do{ 
        System.out.println("1 for Print array");
        System.out.println("2 for Enter element at possition");
        System.out.println("3 for Insert start possition");
        System.out.println("4 for Delete at start possition");
        System.out.println("5 for Search element in array");
        System.out.println("6 for Delete element last possition");
        System.out.println("7 for insert element last possition");
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
                 break;
            case 5:
            search_arr(arr,sc);
            break;
            case 6:
            arr=deleteAtEnd(arr);
            printarr(arr);
            break;
            case 7:
            arr=addAtend(arr,sc);
            printarr(arr);
            break;
            default:
                System.out.println("----Please enter valid number ----");
                break;
        }   
     } while(i>0);

    }
}
