package Strings;


public class SearchString {

    public static void main(String[] args) {

        String s1= "I have drawn a drawing";

       int position= s1.indexOf("draw");
       int last_position=s1.lastIndexOf("draw");

        System.out.println(position+""+last_position);


    }
}
