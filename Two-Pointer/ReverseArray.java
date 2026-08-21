
public class ReverseArray {

    public static void main(String[] args) {

      int[] arr={11,1,2,3,4,5,5,6,7};
      int i=0;
      int j=arr.length-1;
      while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;

          i++;
          j--;
      }
      for(int m=0; m< arr.length; m++ ){
          System.out.print(" " + arr[m]);
      }
    }
}
