import com.sun.org.apache.xpath.internal.SourceTree;

public class Car{

    private String make;
    int speed;
    int gear;
    public Car(){
        this(10,2);
        this.speed=0;
        this.gear=0;
        System.out.println("Executing Constructor without arguments:");
    }
    public Car(int speed, int gear){
        this.speed=10;
        this.gear=0;
        System.out.println("Exuecuting Constructor with arguments:");
    }
  public void setMake(String make){
        this.make=make;
  }
  public String getMake(){
      return make;
  }
}

