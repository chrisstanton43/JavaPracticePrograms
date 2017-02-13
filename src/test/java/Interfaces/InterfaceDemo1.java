package Interfaces;

interface CarInterface {

    public String speed="100";
    public void engineStart(String engineType, boolean isKeyLess);
}
interface BMWCarInterface{
    public void headUpNavigation();
}

class InterfaceDemo implements CarInterface, BMWCarInterface {

    public void engineStart(String engineType, boolean isKeyLess){
        System.out.println("This is the implementation");

    }

    public void headUpNavigation() {
        System.out.println("This is the headsupnavigation");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        CarInterface myInterface= new InterfaceDemo();
        myInterface.engineStart("6 Cyl", true);
    }
}
