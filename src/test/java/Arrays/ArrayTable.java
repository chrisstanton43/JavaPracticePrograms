package Arrays;

/**
 * Created by user1 on 18/03/2017.
 */
public class ArrayTable {

    public static void main(String[] args) {

        int numbers[]={1, 2, 3,4,5};

        for (int counter=0; counter<numbers.length;counter++)
        {
            System.out.println(counter+"\t"+numbers[counter]);
        }
    }
}
