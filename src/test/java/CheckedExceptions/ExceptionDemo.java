package CheckedExceptions;

import java.sql.SQLException;

public class ExceptionDemo {
    public static void main(String[] args){
        Account acc=new Account();
        try{
            acc.withdraw(100);
        }catch (SQLException e){
            System.out.println("Try again after some time");
        }finally {
            System.out.println("Executes");
        }

    }
}
