public class  RotateArrayByK{
      static void DisplayArr(int []arr){
      int n=arr.length;
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+ " ");
      }
      System.out.println(" ");
    }
    static void kstep(int[]arr,int k){
       
        int n=arr.length;
         k=k%n;
        for(int i=0; i<k; i++){
            int temp=arr[n-1];
            for(int j=n-1; j>0; j--){
              arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println("Before kstep");
        DisplayArr(arr);
        System.out.println("After kstep");
        kstep(arr,3);
        DisplayArr(arr);
    }
}
