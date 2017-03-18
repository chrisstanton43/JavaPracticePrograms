package Arrays;

/**
 * Created by user1 on 18/03/2017.
 */
public class AddingElementsToArray {

    public static void main(String[] args) {

        int number[]={1, 2, 3, 4,5};

        int total=0;

        for(int counter=0; counter<number.length; counter++)
        {
            total=total+number[counter];
        }
        System.out.println(total);
    }
}

