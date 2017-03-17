package ConditionalStatements;


public class SwitchStatement {

    public static void main(String[] args) {

        int rating=4;

        switch (rating)
        {
            case 1:
                System.out.println("Poor rating");
                break;
            case 2:
                System.out.println("Bad rating");
                break;
            case 3:
                System.out.println("Average rating");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
        }
    }


}
