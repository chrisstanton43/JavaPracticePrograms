package Inheritance;

class Cars{
    int speed;
    Cars(int speed){
        this.speed=speed;
    }
    void increaseSpeed(){
        speed++;
        System.out.println("Increasing speed:");
    }

    void decreaseSpeed(){
        speed--;
        System.out.println("Decreasing speed:");
    }
}
class BMW extends Cars{
//    int speed=0;
    public BMW(int Speed){
        super(Speed);
    }

}
public class InheritanceDemo {
    public static void main(String[] args) {
        int speed=0;
        Cars c1=new Cars(speed);
        c1.increaseSpeed();
    }
}
