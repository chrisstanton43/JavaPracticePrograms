package RuntimeExceptions;

public class RunTimeExceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println("The result is:" + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}