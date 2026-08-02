public class Task1_PrintFirstNNumbers{

    static void nterm(int n){
        if(n==0){
      return;
        }
        nterm(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
      nterm(10);
    }
}


  

