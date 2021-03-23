import java.util.ArrayList;

/**
* @author (Kyle Guarco)
* @version (July 17, 2020)
*/
public class CTRivers
{
    // A function I added which just prints all the rivers.
    public void printRiversRec(River[] list, int n)
    {
        if (n < 1)
            return;
        
        printRiversRec(list, n - 1);
            
        System.out.println(list[n - 1]);
    }
    
    public void printLongRiversRec(River[] list, int n)
    {
        if (n < 1)
            return;
        
        printLongRiversRec(list, n - 1);
            
        if (list[n - 1].isLong())
            System.out.println(list[n - 1]);
    }
    
    public void sortByNameRec(River[] list, int n)
    {
        if (n < 1) return;
        
        sortByNameRec(list, n - 1);
        
        River river = list[n - 1];
        
        int index = 0;
        River compare = list[index];
        
        while (index < n - 1)
        {
            if (compare.getName().compareTo(river.getName()) > 0)
                break;
            index++;
            compare = list[index];
        }
        
        list[n - 1] = compare;
        list[index] = river;
    }
    
    // sortByNameRec() must be called first.
    public int binarySearchRec(River[] list, int first, int last, String name) 
    {
        if (first > last)
            return -1;
        
        int index = (first + last) / 2;
        String nameIdx = list[index].getName();
        
        if (nameIdx.equals(name))
            return index;
        
        String nameFirst = list[first].getName();
        String nameLast = list[last].getName();
        
        if (nameIdx.compareTo(name) < 0)
        {
            first = index;
        } else if (nameIdx.compareTo(name) > 0) {
            last = index;
        }
            
        return binarySearchRec(list, first, last, name);
    }
    
    public int linearSearch(River[] list, int n, String name) 
    {
        for (int i = 0; i < n; i++)
        {
            if (list[i].getName().equals(name))
                return i;
        }
        
        return -1;
    }
    
    // Returns rivers with length min->max (inclusive)
    public ArrayList<River> searchRange(River[] list, int n, int min, int max)
    {
        ArrayList<River> rivers = new ArrayList<River>();
        
        for (int i = 0; i < n; i++)
        {
            int length = list[i].getLength();
            
            if (length >= min && length <= max)
                rivers.add(list[i]);
        }
        
        return rivers;
    }
}
