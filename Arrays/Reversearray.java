public class  Reversearray{
    static void DisplayArr(int []arr){
      int n=arr.length;
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+ " ");
      }
      System.out.println(" ");
    }
     static void SwapArray(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }
    static void reverceArray(int []arr){
      int i=0, n=arr.length, j=n-1;
      while(i<j){
        SwapArray(arr, i, j);
        i++;
        j--;
      }
    }
   
 public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6};
    System.out.println("Before reverse");
DisplayArr(arr);
reverceArray(arr);
System.out.println("after reverse");
DisplayArr(arr);
 }
}
