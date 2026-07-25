//check adult or not adult using do while loop 
package loop;
import java.util.*;
public class age_checker {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=0;
        do{ System.out.print("enter your number Age:");
            age=sc.nextInt();
             if(age>=18){
            System.out.println("you are adult");}
            else{
                System.out.println("not adult!");
            }
            age++;
             }
                
                while(age>0);
                System.out.println("Wrong AGE number");
    }

}
