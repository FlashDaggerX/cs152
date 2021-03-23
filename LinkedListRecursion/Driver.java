/**
 * Class Driver tests methods from LLMagazineRec class.
 * 
 * @author (Irena) and (Kyle Guarco)
 * @version (July, 19, 2020)
 */
public class Driver
{
   public static void main(String[] args)
   {
       System.out.println("Creating linked list myList");
       LLMagazineRec myList = new LLMagazineRec();
       myList.addRear(new Magazine(39, "Golf Digest"));
       myList.addRear(new Magazine(41, "Sports Illustrated")); 
       myList.addRear(new Magazine(105, "Time"));
       myList.addRear(new Magazine(133, "Vogue"));
       
       System.out.println("\nPrinting resulting ArrayList");
       myList.createArrayListRec(myList.getList()).forEach(System.out::println);
    }   
}
