/**
 * Class Magazine describes magazine object that has title and number of pages
 * 
 * @author (Irena)
 * @version (July 17, 2020) 
 */
public class Magazine
{    
    private int pages;  //number of pages
    private String name; // magazine name or title

    public Magazine(int p, String n)
    {
        pages = p;
        name = n;
    }

    public int getPages()
    { 
        return pages;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return name + "\t" + pages;
    }
}
