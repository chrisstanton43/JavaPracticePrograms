package OOPS.MethodOverloading;

/**
 * Sequence of data type of arguments
 */
public class CarsOverloading3 {
    public static void main(String[] args) {
        increaseSeatHeight("subbu",543);
        increaseSeatHeight(543,"subbu");

    }
    public static void increaseSeatHeight(String variable1, int variable2){
        System.out.println("I am the First overload");
    }
    public static void increaseSeatHeight(int variable2, String variable1){
        System.out.println("I am the Second overload");
    }
}
