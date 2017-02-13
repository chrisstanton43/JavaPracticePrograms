package MethodOverriding;

public class CarOverridingChildBMW extends CarsOverridingParents {
    public static void main(String[] args) {
        CarsOverridingParents c1=new CarOverridingChildBMW();
        c1.engineStart();
        c1.increaseSpeed();
    }
    public void engineStart(int cyl){
        super.engineStart();
        System.out.println("I am from child class");
    }

}
