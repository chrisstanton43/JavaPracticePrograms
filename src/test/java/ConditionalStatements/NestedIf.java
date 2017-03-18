package ConditionalStatements;

/**
 * Created by user1 on 18/03/2017.
 */
public class NestedIf {

    public static void main(String[] args) {

        int age=69;

        if(age>60){

            if(age>70){

                System.out.println("Yu are too old");

            }
            else {
                System.out.println("You are old");
            }
        }
    }
}
