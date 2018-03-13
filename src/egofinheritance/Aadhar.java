
package egofinheritance;

/**
 *
 * @author stuti
 */
public class Aadhar extends IdentityCard 
{
    private String aadhar;
    
    Aadhar(String name,int age,String birthday,String city, String aadhar)
    {
        super(name,age,birthday,city);
        this.aadhar = aadhar;
    }
    
    public String getaadhar()
    {
        return this.aadhar;
    }
    
}
