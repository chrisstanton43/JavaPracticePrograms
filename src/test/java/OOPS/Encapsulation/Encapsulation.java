package OOPS.Encapsulation;

// Combining that encapsulating the attributes of class with in the methods inside the class. So that no other class could actually have no direct access to it
class Student{

    private String name;

    public void setName(String NewName){

        name= NewName;
    }

    public String getName(){

        return name;

    }
}
public class Encapsulation {

    public static void main(String[] args) {

        Student s= new Student();
        s.setName("Chris");
        System.out.println(s.getName());
    }
}
