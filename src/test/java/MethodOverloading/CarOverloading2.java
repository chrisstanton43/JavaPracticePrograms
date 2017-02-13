package MethodOverloading;

/**
 * Difference in data type of arguments
 */
public class CarOverloading2 {
    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight(" g ");


    }
    public static void increaseSeatHeight(int heightToIncrease){
        System.out.println("Increased seat height "+heightToIncrease+"inches. I am the integer one");
    }
    public static void increaseSeatHeight(String heightToIncrease){
        System.out.println("Increased seat height "+heightToIncrease+"inches. I am the String one");
    }
}
