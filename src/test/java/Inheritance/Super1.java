package Inheritance;

class One{
    int i=10;
    int j=20;
    void show(){
//        System.out.println("super class method:i=" +i);
    }
}
class Two extends One{
   int k=40;
    void show(){
        System.out.println("sub class method:i=" +i);
        System.out.println("sub class method:j=" +j);
        System.out.println("sub class method:j=" +k);
    }
}
public class Super1 {
    public static void main(String[] args) {
        Two t= new Two();
        t.show();
    }
}
