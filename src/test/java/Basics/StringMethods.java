package Basics;

public class StringMethods {
    public static void main(String[] args){
        String str="Subbarao Chavala";
        String str1="Subbarao";
        String str2= "Chavala";
        String str3= "welcome";
        String str4= "Chavala";
        String str5= "            Subbara Chavala       ";
        String str6="Hello";
        String str7 ="";
        System.out.println("Length of the string:"+str.length());
        System.out.println("Charater at index 2 is:"+str.charAt(2));
        System.out.println(str.concat(" Automation test engineer"));
        System.out.println("Contains with check: "+str.contains(" Chavala"));
        System.out.println("Starts with check1: "+str.startsWith("subbarao"));
        System.out.println("Starts with check2: "+str.startsWith("Subbarao"));
        System.out.println("Ends with check: "+str.endsWith("chavala"));
        System.out.println("Check Contents are equal:"+str.equals("str2"));
        System.out.println("Check Contents are equal: "+str2.equals("str4"));
        System.out.println("Index of 'r' is: "+str.indexOf("r"));
        System.out.println("Check if string is empty1: "+ str.isEmpty());
        System.out.println("Check if string is empty2: "+ str7.isEmpty());
        System.out.println("Trim the leading and tailing spaces : "+str5.trim());
        System.out.println(str.replace('a','u'));
        char[] charArray= str3.toCharArray();
        for(int i=0; i<charArray.length;i++){
            System.out.println("Index "+i + "is:" +charArray[i]);
        }
        System.out.println("Lower case: "+ str.toLowerCase());
        System.out.println("Upper case: "+ str.toUpperCase());
    }
}

