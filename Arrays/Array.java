//DAY 1
//create a array day1 user input array size define by user and in array input given by user also 
package array;
import java.util.*;
public class Array{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter array size:-");
int size=sc.nextInt();
int number[]=new int[size];
System.out.print(size + "enternumber");
for(int j=0; j<size; j++){
    number[j]=sc.nextInt();
}
System.out.print("Array is ");
for(int i=0; i<size; i++){
    System.out.print(number[i] +" ");
}
System.out.println(" ");
}
}
