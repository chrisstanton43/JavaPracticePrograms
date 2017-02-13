package MethodOverloading;

/**
 * Different Number of parameters in argument list
 */

public class CarsOverloading {

    //1. Number of parameters could be different
    //2. Data type of parameters are different
    //3. Sequence of data type is different
    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight(2,true);

    }
    public static void increaseSeatHeight(int heightToIncrease){
            System.out.println("Increased seat height "+heightToIncrease+"inches");
    }
    public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
            System.out.println("Increased seat height "+heightToIncrease+"inches");
            if(rememberHeight){
                System.out.println("Our selection is saved");
            }else
                System.out.println("Our selection not saved");
    }

}

