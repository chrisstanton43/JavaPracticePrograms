package Inheritance;

/**
 * Created by Ravish on 11/02/2017.
 */
class UseTeacher {

        public static void main(String[] args) {
            Teacher s=new Teacher();

            s.setId(1000);
            s.setAddress("Subbarao");
            s.setSal(35000);
            System.out.println("Id:"+s.getId());
            System.out.println("Name:"+s.getAddress());
            System.out.println("Address:"+s.getSal());
        }
    }

