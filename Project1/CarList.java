import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Parses and displays information from a list of cars.
 * 
 * @author (Kyle Guarco)
 * @version (July 6, 2020)
 */
public class CarList 
{
    private ArrayList<Car> list;

    public CarList(String listName)
    {
        this.list = parse(listName);
    }

    public void printList()
    {
        list.forEach(System.out::println);
    }

    public void printCarsWithMake(String make)
    {
        for (Car car : list)
            if (car.getMake().equalsIgnoreCase(make))
                System.out.println(car);
    }

    public int countAntiqueCars()
    {
        int count = 0;

        for (Car car : list)
            if (car.isExpensive())
                count++;

        return count; 
    }

    public Car newestCar()
    {
        Car newest = list.get(0);

        for (Car car : list)
            if (car.getYear() > newest.getYear())
                newest = car;

        return newest; 
    }

    public ArrayList<Car> antiqueExpensiveCarList()
    {
        ArrayList<Car> cars = new ArrayList<Car>();

        for (Car car : list)
            if (car.isAntique() && car.isExpensive())
                cars.add(car);

        return cars;
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    private ArrayList<Car> parse(String fileName)
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        
        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
    
                String[] args = line.split(" ");
    
                String  vin = args[0],
                        make = args[1],
                        model = args[2];
                int     year = Integer.parseInt(args[3]),
                        price = Integer.parseInt(args[4]);
    
                cars.add(new Car(vin, make, model, year, price));
            }
            
            // Don't forget to free up those valuable system resources!
            scanner.close();
        } catch (IOException e) {
            // Exit loudly: Tell the user the file doesn't exist and exit.
            System.out.println("The file containing the list of cars doesn't exist: " + fileName);
            System.exit(-1);
        }

        return cars;
    }
}