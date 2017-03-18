package OOPS.Inheritance;
import AccessModifiers.Cars;

//class Cars{
//    int speed;
//    Cars(int speed){
//        this.speed=speed;
//    }
//    void increaseSpeed(){
//        speed++;
//        System.out.println("Increasing speed:");
//    }
//
//    void decreaseSpeed(){
//        speed--;
//        System.out.println("Decreasing speed:");
//    }
//}
class BMW extends Cars{
//    int speed=0;
    public BMW(int startSpeed){
        super(startSpeed);
    }
    public void increaseSpeed(){
        protectedSpeed++;
        Cars c1= new Cars();
        c1.decreaseSpeed();
        System.out.println("Increasing Speed of BMW");
    }
    public void headsUpDisplayNavigation(){
        System.out.println("BMW Specific Functionality");
    }
    public void stop(){
        Cars c1=new Cars();
        c1.decreaseSpeed();
    }

}
public class InheritanceDemo {
    public static void main(String[] args) {
        int speed=0;
        Cars c1=new Cars(speed);
        c1.increaseSpeed();
        c1.publicSpeed=10;

    }
}
