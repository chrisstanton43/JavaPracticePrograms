package JavaExamples;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
         int num, array[], count, item;

        System.out.println("Enter number of elements:");

        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        array=new int[num];
        System.out.println("Enter"+ num +"integers");

        for(count=0;count<num;count++){
            array[count]=sc.nextInt();
        }
        System.out.println("Enter the search value:");
        item=sc.nextInt();

        for(count=0;count<num;count++){
            if(array[count]==item){
                System.out.println(item + " is present at location "+(count+1));
                break;
            }

        }if(count==item)
            System.out.println(item + "Doesn't exist in array.");

    }
}
