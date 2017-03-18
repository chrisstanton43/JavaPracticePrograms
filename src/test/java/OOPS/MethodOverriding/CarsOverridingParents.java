package OOPS.MethodOverriding;

/***
 * Rules
 * 1. Argument Lists: Argument list in the overriding method should be as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding cannot be more restrictive than the overridden method
 * 3. private, static and final methods cannot be overridden as they are local to the class
 */

public class CarsOverridingParents {

    public void engineStart(){
        System.out.println("I am from parent class");
    }

    public void increaseSpeed(){
        System.out.println("I am the increase speed from parent class");
    }
}
