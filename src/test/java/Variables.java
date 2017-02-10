/**
 * Created by Ravish on 07/02/2017.
 */
public class Variables {
    public static void main(StringDemo[] args)
    {
       /*
        * Byte
        * Min: -128
        * Max: 127
        * Default: 0
        */
        byte myByte=100;
        System.out.println("Byte value:"+myByte);

        /*
         * short
         * Min: -32,768
         * Max: 32,767
         * Default: 0
         */
        short myShort= 10000;
        System.out.println("Short value:"+myShort);
        /*
         *Int
         * Min: -2,147,483,648
         * Max: 2,147,483,647
         * Default: 0
         */
        int myInt= 10000;
        System.out.println("int value:"+myInt);
        /*
         * Long
         * Min: -9223372036854775808
         * Max: 9223372036854775807
         * Default: 0
         */
        long myLong= 1000000000;
        System.out.println("Long value:"+myLong);
        /*
         * Float
         * Min: 1.4E-45
         * Max: 3.4028235E38
         * Default: 0
         */
        float myFloat= 21.0f;
        System.out.println("Float value:"+myFloat);
       /*
         * Double
         * Min: 4.9E-324
         * Max: 1.7976931348623157E308
         * Default: 0
         */
        double myDouble= 21.0;
        System.out.println("Double value:"+myDouble);

        /*
         * Boolean
         * flase and  true
         * Default: false
         */
        boolean myBoolean = true;
        System.out.println("Boolean value:" +myBoolean);

        /*
         * Char
         * Min: 0
         * Max: 65,535
         */
        char myChar = 'a';
        System.out.println("Char value:" +myChar);


       /* System.out.println("Byte.MIN = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN = " + Short.MIN_VALUE);
        System.out.println("Short.MAX = " + Short.MAX_VALUE);
        System.out.println("Integer.MIN = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN = " + Long.MIN_VALUE);
        System.out.println("Long.MAX = " + Long.MAX_VALUE);
        System.out.println("Float.MIN = " + Float.MIN_VALUE);
        System.out.println("Float.MAX = " + Float.MAX_VALUE);
        System.out.println("Double.MIN = " + Double.MIN_VALUE);
        System.out.println("Double.MAX = " + Double.MAX_VALUE);
        */
    }
}
