
package egofinheritance;
/**
 *
 * @author stuti
 */
public class Passport extends IdentityCard
{
    private long passport_no;
    
    
    Passport(String name,int age,String birthday,String city,long passport_no)
    {
        super(name,age,birthday,city);
        this.passport_no = passport_no;
    }
    
    public long getpassport_no()
    {
        return this.passport_no;
    }
}
