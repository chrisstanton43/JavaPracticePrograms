package JavaExamples;

import java.util.*;

/**
 * Created by Ravish on 13/02/2017.
 */
public class CheckEvenOdd {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter an Integer number:");

        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();

        if(num%2==0){
            System.out.println("Entered number is Even.");
        }else
            System.out.println("Enter number is Odd.");
    }
}
