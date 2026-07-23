//insert element in java array
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr=new int[6];
       arr[0]=10;
       arr[1]=20;
       arr[2]=40;
       arr[3]=50;
       arr[4]=60;
    int index=2;
    int num=30;
        for(int i=5; i>index; i--){
            arr[i]=arr[i-1];
        }
        arr[index]=num;
        for(int i=0; i<6; i++){
            System.out.print(arr[i]+ " ");
        }
    }     
}
