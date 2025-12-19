//find min and max in a Array using java
package array;

public class min_max {
    public static void main(String[]args){
        int[] arr = {1, 2, 30, 4, 5};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int max=0;
        for(int j=0; j<arr.length; j++){
         int min=arr[j];
         if(min>max){
            max=min;
         }
        }
        System.out.print("maxinum number in array is ");
        System.out.println(max);

        int min=arr[0];
          for(int i=1; i<arr.length; i++ ){
         max =arr[i];
        if(max<min){
           min=max;
          }
        }
        System.out.println(min);

    }
    
}
