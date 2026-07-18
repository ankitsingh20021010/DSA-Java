// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] marks= new int[10];
        marks[0]=98;
        marks[1]=94;
        marks[2]=96;
        marks[3]=92;
        marks[4]=93;
        marks[5]=95;
        marks[6]=88;
        marks[7]=91;
        marks[8]=93;
        marks[9]=92;
        
        Arrays.sort(marks);
         int size=marks.length;
        for(int i=0; i<size; i++){
            System.out.print(" " + marks[i]);
        }
        

    }
}
