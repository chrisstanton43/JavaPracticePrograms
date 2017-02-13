package Abstraction;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Ravish on 11/02/2017.
 */
public class Cars {
    private int privateSpeed;
    //Anywhere in Java World with importing the package and class
    public int publicSpeed;
    //In same packe and in sub classes
    protected int protectedSpeed;

    int speedLimit=100;

    public Cars() {
        this(0);
    }
    public Cars(int startSpeed){
        this.privateSpeed=startSpeed;
        }
    public void setPrivateSpeed(int pSpeed){
        this.privateSpeed=pSpeed;
    }
    public void increasSpeed(){
        if(speed<100){
            speed++;
        }
        System.out.println("Increasing speed of Cars:");
    }
    protected void decreaseSpeed(){
        speed--;
        System.out.println("Decreasing speed of Cars");
    }
}
