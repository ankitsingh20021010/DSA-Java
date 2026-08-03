 Task6_FibonacciSeries.{
static void fibo(int a, int b,int n){
     
     if(n==0){
         return;
     }
     System.out.print(b + " ");
     fibo(b,a+b,n-1);
 }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        fibo(0,1,5);
        
     }
    }
