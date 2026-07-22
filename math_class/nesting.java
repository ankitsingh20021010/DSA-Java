//find tree number min max using nesting technique
public class Nesting{
    public static void main(String[] args) {

        int a = 10;
        int b = 50;
        int c = 30;

        int max = Math.max(a, Math.max(b, c));
      int min = Math.min(a, Math.min(b, c));

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
