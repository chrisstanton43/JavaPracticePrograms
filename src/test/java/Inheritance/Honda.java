package Inheritance;

import AcceModifiers.Cars;

public class Honda extends Cars {
    public void increaseSpeed(){
        Cars c1=new Cars();
        c1.publicSpeed=10;
        c1.setPrivateSpeed(10);
        protectedSpeed=100;
    }
}

