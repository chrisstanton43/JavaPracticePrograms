package OOPS;

import java.util.Scanner;

class Student{

    int ID;
    String name;
    int marks;

    public void setData()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id:");
        ID=sc.nextInt();

        System.out.println("Enter name:");
        name=sc.next();

        System.out.println("Enter marks:");
        marks=sc.nextInt();
    }
    public void getData()
    {
        System.out.println("Name:"+name+" "+"ID:"+ID+" "+"Marks:"+marks);

    }
}
public class PracticeExample {

    public static void main(String[] args) {

        Student s= new Student();

        s.setData();
        s.getData();


    }
}
