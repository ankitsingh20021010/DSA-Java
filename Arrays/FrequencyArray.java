import java.util.*;
public class FrequencyArray{
   static void friOcur(int[]arr,int []arr2){
   int n=arr.length;
   int temp;
     for(int i=0; i<n; i++){
        temp=arr[i];
        arr2[temp]=++arr2[temp];
     }
   }
    public static void main(String[] args) {     
        int[] arr={1,2,3,3,4,2,5,6,3,4,5,5,3,2,6,3,4,5,6,3,9,9,9,9,9,9,};
        int n=arr.length;
        int []arr2=new int[n];
          friOcur(arr,arr2);
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number to find friquance: ");
         int number=sc.nextInt();
          System.out.println(arr2[number]);
    //     arr[2]=++arr[2];
    }
}

}
