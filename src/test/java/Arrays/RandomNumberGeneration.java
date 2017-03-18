package Arrays;

import java.util.Random;

/**
 * Created by user1 on 18/03/2017.
 */
public class RandomNumberGeneration {

    public static void main(String[] args) {

        Random dice= new Random();

        int number;

        for (int i=0; i<=10; i++){

            number=dice.nextInt(3);;
            System.out.println(number);
        }
    }
}
