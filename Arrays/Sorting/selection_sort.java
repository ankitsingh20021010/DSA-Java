import java.util.*;
class Sorting{
public static void printArr(int arr[]){
for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
}
}
}
public class selection_sort {
    public static void main(String[]args){
     int[] arr={7,2,3,1,8,6,5,4};
     for(int i=0; i<arr.length-1; i++){
        int smallest = i;
        for(int j=1+i;j<arr.length; j++){
         if(arr[smallest]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[smallest];
            arr[smallest]=temp;
         }
        }
     }
      Sorting.printArr(arr);
    }
    
}

