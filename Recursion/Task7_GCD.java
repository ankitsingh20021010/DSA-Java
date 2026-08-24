public class Task7_GCD {

    public static int findGCD(int a, int b) {

        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);
    }

    public static void main(String[] args) {

        int a = 48;
        int b = 18;

        System.out.println("GCD: " + findGCD(a, b));
    }
}
