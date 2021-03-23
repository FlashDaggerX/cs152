/**
 * @author (Kyle Guarco)
 * @version (July 17, 2020
 */
public class River
{
    private String name;
    // 'length' in miles
    private int length;
    
    public River(String name, int length)
    {
        this.name = name;
        this.length = length;
    }
    
    @Override
    public String toString()
    {
        return String.format("River \"%s\" is %d miles long", name, length);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public boolean isLong()
    {
        return length > 30;
    }
}
