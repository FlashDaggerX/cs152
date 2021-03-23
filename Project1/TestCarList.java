/**
 * 
 * @author (Kyle Guarco)
 * @version (July 6, 2020)
 */
public class TestCarList 
{
    public static void main(String[] args) 
    {
        // The fileName passed into CarList gets parsed using CarList.parse()
        CarList cars = new CarList("carList.txt");

        if (cars.isEmpty()) {
            // Do nothing if the file is empty.
            System.out.println("The file containing the cars is empty. Exiting...");
            System.exit(-2);
        }

        System.out.println("All the cars: ");
        cars.printList();

        System.out.println("\n\"Ford\" cars: ");
        cars.printCarsWithMake("Ford");
        
        System.out.println("\nNewest car: \n" + cars.newestCar());

        int antiqueCount = cars.countAntiqueCars();
        // If there are any antique cars in the list, print the count. Otherwise, print "no".
        Object anyAntique = antiqueCount > 0 ? antiqueCount : "no";
        System.out.println("\nThere are " + anyAntique + " antique cars in the list.");
        
        System.out.println("\nExpensive and antique cars in the list: ");
        cars.antiqueExpensiveCarList().forEach(System.out::println);
    }
}