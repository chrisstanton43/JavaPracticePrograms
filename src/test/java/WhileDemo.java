
public class WhileDemo {
    public static void main(String[] args) {
        int i=1;

        while(i<=20){
            System.out.println(i);
            i++;
            if(i==17){
               continue;
            }

        }
        System.out.println("Outside loop:");
    }
}
