package ConditionalStatements;


public class LogicalOperators {

    public static void main(String[] args) {

        int phy, chem;
        phy=70;
        chem=90;

        if(phy>40 && chem>40){
            System.out.println("You passed the test");
        }
        else
        {
            System.out.println("You failed the test");
        }
    }
}
