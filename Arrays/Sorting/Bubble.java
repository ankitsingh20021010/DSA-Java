import java.util.*;
//Bubble sort using java 
public class Bubble {
    public static void main(String[] args) {
        
    
    int [] arr={10,50,30,20,40,80,70,60};
    int n=arr.length;
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;

            }
        }
    }
    for(int p=0; p<arr.length; p++){
    System.out.println(arr[p]);
    }
}
}
