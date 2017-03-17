package Methods;

/**
 * Created by user1 on 26/02/2017.
 */
public class LearningMethods {

    int i; //declaration , initialize

    public void go(){
        System.out.println("Inside Go method");
        go1();

    }

    public void go1(){
        System.out.println("Inside Go1 method");
        go2();

    }
    public void go2(){
        System.out.println("Inside Go2 method");
        go3();


    }
    public static void go3(){
        System.out.println("Inside Go3 method");


    }
    public static void main(String[] args) {

        LearningMethods m= new LearningMethods();
        m.go();







    }
}
