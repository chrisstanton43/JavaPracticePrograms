package Abstraction;


public class AbstractDemoBMW extends AbstractCars {

       public void setPrivateSpeed(int speed){
           super.setPrivateSpeed(10);
        }

//        public void engineStart(){
//           super.engineStart();
//            System.out.println("BMW ");
//        }
        public void engineStart(String keyType, int numOfCycl){
            System.out.println("This is the BMW engine start");
        }

}
