public class Task5_NthFibonacci{
      static int fiboo(int n){
   if (n==0){
    return 0;
   }
   if(n==1){
    return 1;
   }
   return fiboo(n-1) + fiboo(n-2);
}

    
    public static void main(String[] args) {
        
    }

}
