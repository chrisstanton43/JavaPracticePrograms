
import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] myIntArray1;
        myIntArray1=new int[10];
        myIntArray1[0]=100;
        myIntArray1[1]=90;
        myIntArray1[2]=80;
        myIntArray1[3]=70;
        myIntArray1[4]=60;
        System.out.println("0 Index:"+myIntArray1[0]);
        System.out.println("1 Index:"+myIntArray1[1]);
        System.out.println("2 Index:"+myIntArray1[2]);
        System.out.println("3 Index:"+myIntArray1[3]);
        System.out.println("4 Index:"+myIntArray1[4]);

        String[] myStringArra1={"Subbu", "Anu","raja","Ramu"};
        System.out.println("0 Index:"+myStringArra1[0]);
        System.out.println("1 Index:"+myStringArra1[1]);
        System.out.println("2 Index:"+myStringArra1[2]);
        System.out.println("3 Index:"+myStringArra1[3]);

        int len1=myIntArray1.length;
        int len2=myStringArra1.length;
        System.out.println("Int Array Length::"+len1);
        System.out.println("Int String Length;"+len2);

        for (int i=0;i<len1;i++){
            System.out.println(myIntArray1[i]);
        }
        Arrays.sort(myIntArray1);
        for (int i=0;i<len1;i++){
            System.out.println(myIntArray1[i]);
        }

    }
}
