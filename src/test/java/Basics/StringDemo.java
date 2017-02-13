package Basics;

import java.lang.*;

public class StringDemo {

    public static void main(StringDemo[] args){
        //String Literal- String Constant pool
        String str1 = "Hello";
//        String str3 = "Hello";
        // String Object - Heap
        String str2=new String("World");
        String strAdd=str1+str2;
        System.out.println("Add Two strings:" +strAdd);
    }
}
