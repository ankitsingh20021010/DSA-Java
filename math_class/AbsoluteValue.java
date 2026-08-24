public class AbsoluteValue {

    public static void main(String[] args) {

        int num = -25;

        int result;

        if (num < 0) {
            result = -num;
        } else {
            result = num;
        }

        System.out.println("Absolute value: " + result);
    }
}
