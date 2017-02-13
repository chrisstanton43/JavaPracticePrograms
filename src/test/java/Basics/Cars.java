package Basics;
public class Cars {
    int speed;
    private int privateSpeed;
    int speedLimit=100;
    protected int speedP;

    public Cars(){
        this(0);
    }
    public Cars(int speedP){
        speed=speedLimit;
    }
    public void increaseSpeed(){
        if(speed<100){
            speed++;
        }
        System.out.println("Increasing Speed of Cars");
    }
    protected void decreaseSpeed(){
        speed--;
        System.out.println("Decreasing Speed");
    }


}

