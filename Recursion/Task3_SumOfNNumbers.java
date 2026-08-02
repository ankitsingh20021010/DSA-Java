public class Task3_SumOfNNumbers{
      static int sumOfN(int n){
        if(n==1){
            return 1;
        }

     return n + sumOfN(n-1);    
    }
    public static void main(String[] args) {
        int ss=sumOfN(10);
        System.out.println(ss);
    }
  
}
