package ConditionalStatements;

import java.util.Scanner;

/**
 * Created by user1 on 18/03/2017.
 */
public class SimpleIntrestProgram {

    public static void main(String[] args) {

        double p, n, r, si;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter principle amount:");
        p=sc.nextDouble();

        System.out.println("Enter no of years:");
        n=sc.nextDouble();

        System.out.println("Enter rate of intrest:");
        r=sc.nextDouble();

        si=(p*n*r)/100;

        System.out.println("The intrest is:" + si);
    }
}
