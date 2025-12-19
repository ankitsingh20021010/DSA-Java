//average of array element 
package array;

public class avg {
    public static void main(String[] args) 
        {
        int[]arr={10,20,30,40,50};
        int m=0;
        for(int i=0; i<5; i++){
            int n=arr[i];
            m=m+n;

        }
        System.out.println(m/arr.length);
    }
    
}
