package Inheritance;

class UseStudent {
    public static void main(String[] args) {
        Student s=new Student();

        s.setId(1000);
        s.setName("Subbarao");
        s.setAddress("121 Stanhope street Fenham");
        s.setMarks(950);
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        System.out.println("Address:"+s.getAddress());
        System.out.println("Marks:"+s.getMarks());
    }
}

