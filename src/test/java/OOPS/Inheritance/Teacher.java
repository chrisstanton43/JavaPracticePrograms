package OOPS.Inheritance;

class Teacher {
    int id;
    String name;
    String address;
    float sal;

    //setter method to store id
    void setId(int id){

        this.id=id;
    }
    int getId(){

        return id;
    }
    void setAddress(String address)

    {
        this.address=address;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName(){
        return name;
    }
    String getAddress(){

        return address;
    }
    void setSal(float sal)

    {
        this.sal=sal;
    }
    float getSal(){
        return sal;
    }
}
