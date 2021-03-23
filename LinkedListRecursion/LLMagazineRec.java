
import java.util.ArrayList;

/**
 * Class LLMagazineRec defines linked list of magazine objects. It includes
 * recursive methods to print all magazines, to calculate sum pages in all
 * magazines, and to find longest magazine in linked list.
 * 
 * @author (Irena) and (Kyle Guarco)
 * @version (July 19, 2020) 
 */
public class LLMagazineRec
{ 
    private Node list;

    public LLMagazineRec()
    {
        list = null;
    }

    public Node getList()
    {
        return list;
    }
    
    public void addRear(Magazine mag)
    {
        Node node = new Node(mag);
        if (list == null)
           list = node;
        else
        {
            Node curr = list;
            while (curr.next!= null)
               curr= curr.next;
            curr.next = node;
        }
    }
    
    // Returns ArrayList<Magazine> storing all Magazine objects from the linked 
    // list. Method accepts reference to the beginning of the linked list. It
    // must be recursive, and should work for empty and for non-empty list. 
    public ArrayList<Magazine> createArrayListRec(Node first)
    {
        ArrayList<Magazine> list;
        
        if (first.next == null)
            list = new ArrayList<Magazine>();
        else
            list = new ArrayList<Magazine>( createArrayListRec(first.next) );
        
        list.add(first.data);
        
        return list;
    }

    private class Node
    {
        public Magazine data;
        public Node next;
        
        public Node(Magazine mag)
        {
            data = mag;
            next = null;
        }
        
        public String toString()
        {
            return data.toString();
        }
    }
}
