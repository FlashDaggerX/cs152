import java.util.Scanner;
import java.io.File;

/**
 * @author (Kyle Guarco)
 * @version (July 17, 2020)
 */
public class Driver
{
    public static void main(String[] args)
    {
        River[] rivers = new River[10];
        int count = 0;
        
        try {
            Scanner scan = new Scanner(new File("inData.txt"));

            while (scan.hasNextLine())
            {
                String[] line = scan.nextLine().split(" ");
                
                rivers[count] = new River(line[0], Integer.parseInt(line[1]));
                count++;
            }
            
            scan.close();
        } catch (Exception e) {
            System.err.println("Error reading inData.txt");
            System.err.println(e.getMessage());
            
            System.exit(-1);
        }
        
        CTRivers ctr = new CTRivers();
        
        System.out.println("The rivers in Connecticut: ");
        ctr.printRiversRec(rivers, count);
        
        System.out.println("\nThe long rivers (> 30 miles):");
        ctr.printLongRiversRec(rivers, count);
        
        System.out.println("\nSorted rivers: ");
        ctr.sortByNameRec(rivers, count);
        ctr.printRiversRec(rivers, count);
        
        System.out.println("\nUsing binary search to find \"Still\":");
        System.out.println(rivers[ctr.binarySearchRec(rivers, 0, count - 1, "Still")]);
        
        System.out.println("\nLinear river search for \"Pawcatuck\":");
        System.out.println(rivers[ctr.linearSearch(rivers, count, "Pawcatuck")]);
        
        System.out.println("\nRivers with length between 30 and 50 miles:");
        ctr.searchRange(rivers, count, 30, 50).forEach(System.out::println);
    }
}
