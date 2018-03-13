
package egofinheritance;
import java.util.Scanner;

public class EgOfInheritance 
{

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Press 1. for Aadhar and 2. for Passport\n");
        int i = input.nextInt();
        
        switch(i)
        {
            case 1:
                System.out.print("Please enter name,age, birthday,city,aadhar ::  \n");
                String name = input.next();
                int age = input.nextInt();
                String birthday = input.next();
                String city = input.next();
                String aadhar = input.next();
                Aadhar q = new Aadhar(name,age,birthday,city,aadhar);
                
                System.out.printf("The Aadhar details are::Name: %s, age: %d, birthday: %s, city: %s and Aadhar No: %s\n",
                        q.getname(),q.getage(),q.getbirthday(),q.getcity(),q.getaadhar());
                break;
                
            case 2:
                System.out.print("Please enter name,age, birthday,city,passport no ::  \n");
                String name2 = input.next();
                int age2 = input.nextInt();
                String birthday2 = input.next();
                String city2 = input.next();
                long passport_no2 = input.nextLong();
                Passport z = new Passport(name2,age2,birthday2,city2,passport_no2);
                
                System.out.printf("The Aadhar details are::Name: %s, age: %d, birthday: %s, city: %s and Aadhar No: %s\n",
                        z.getname(),z.getage(),z.getbirthday(),z.getcity(),z.getpassport_no());
                break;
                
                
        }
    }
    
}
