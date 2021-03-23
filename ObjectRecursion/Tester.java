import java.util.Scanner;
import java.io.File;

/**
 * @author (Kyle Guarco)
 * @version (July 12, 2020)
 */
public class Tester
{
    public static void main(String[] args)
    {
        House[] houseList = new House[70];
        int count = 0;
        
        try {
            Scanner scan = new Scanner(new File("inData.txt"));
            
            while (scan.hasNextLine())
            {
                // Format: houseNumber, bedrooms, sqFeet, year, cost
                houseList[count] = new House(scan.nextInt(), scan.nextInt(), 
                        scan.nextInt(), scan.nextInt(), scan.nextInt());
                
                scan.nextLine();
                count++;
            }
            
            scan.close();
        } catch (Exception e) {
            // Either an IOException or a NumberFormatException. Print the message!
            System.err.println(e.getMessage());
            System.err.println("There was an error reading \"inData.txt\". Exiting...");
            System.exit(-1);
        }
        
        HouseComplex complex = new HouseComplex();
        
        // Using 'print' here to prevent an extra newline
        System.out.print("All the houses in houseList, in order:");
        System.out.println(complex.toStringRec(houseList, count));
        
        System.out.println("\nAll the expensive houses:");
        complex.printExpensiveHousesRec(houseList, count);
        
        System.out.println("\nThe amount of new houses: " + complex.countNewHousesRec(houseList, count));
        
        System.out.println("\nThe cheapest house on the market: \n" + complex.cheapestHouseRec(houseList, count));
    }
}
