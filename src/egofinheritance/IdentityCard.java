
package egofinheritance;
/**
 *
 * @author stuti
 */
public class IdentityCard 
{
    private String name;
    private int age;
    private String birthday;
    private String city;
    
    IdentityCard(String name,int age,String birthday,String city)
    {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.city = city;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public String getbirthday()
    {
        return this.birthday;
    }
    
    public int getage()
    {
        return this.age;
    }
    
    public String getcity()
    {
        return this.city;
    }
    
}
