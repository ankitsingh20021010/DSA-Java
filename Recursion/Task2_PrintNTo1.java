public class Task2_PrintNTo1{
    static void nnterm(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        nnterm(n-1);
        
    }
    public static void main(String[] args) {
        nnterm(10);
    }
}
