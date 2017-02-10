import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class ClassDemo{
	String str2="Hi there!!!";

	public static void main(String[] args){
		//TODO Auto-generated method stub
//		String str1="Hello Java";
//		System.out.println(str1);
//
//		for(int i=0;i<args.length;i++){
//			System.out.println(args[i]);
        CarClass c1=new CarClass();
        CarClass c2=new CarClass();

        c1.year=2015;
        c2.model="BMW";
		System.out.println("Car Model:"+c1.year);
		}
	}

class CarClass{
    int year;
    String model;

}