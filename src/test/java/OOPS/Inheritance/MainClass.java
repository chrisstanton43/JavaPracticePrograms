package OOPS.Inheritance;

class Parent{

    public static void money(){

        System.out.println("I have million pounds");
    }

}
class Child extends Parent{

}
public class MainClass {

    public static void main(String[] args) {

        Child tom= new Child();

        tom.money();

    }
}
