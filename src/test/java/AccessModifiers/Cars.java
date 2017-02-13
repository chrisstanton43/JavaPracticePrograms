package AccessModifiers;

public class Cars {
    int speed;
    //No Modifier= accessible in th epackage
    private int privateSpeed;

    // Anywhere in java world can accessible
    public int publicSpeed;
    int speedLimit=100;
    protected int protectedSpeed;

    public Cars()
    {
        this(0);
    }
    public void setPrivateSpeed(int pSpeed){

        privateSpeed=pSpeed;
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
    public void decreaseSpeed(){
        speed--;
        System.out.println("Decreasing Speed");
    }


}