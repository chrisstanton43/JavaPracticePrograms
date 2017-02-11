
public class WhileDemo {
    public static void main(String[] args) {
       int i=10;

       while(i<11){
           System.out.println(i);
           i++;
           if(i==15){
               break; //or continue;
           }

        }
        System.out.println("do while loop..");
       do {
           System.out.println(i);
           i++;
           }while(i<20);
    }
}
