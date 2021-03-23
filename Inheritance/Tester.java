/**
 * @author (Kyle Guarco)
 * @version (July 13, 2020)
 */
public class Tester
{
    public static void main(String[] args)
    {
        // Vehicle constructor parameters are as follows (For reference; Switching tabs is so exhausting):
        // String make, int weight, int height, int length, int maxSpeed, int maxPassengers
        Vehicle v;
        
        v = new Truck(400, "Ford", 1700, 6, 15, 180, 2);
        print(v);
        
        v = new Truck(200, "Ford", 1500, 6, 12, 160, 2);
        print(v);
        
        v = new Car(false, "Kia", 1200, 5, 10, 120, 4);
        print(v);
        
        v = new Car(true, "Buick", 1800, 5, 16, 120, 6);
        print(v);
        
        v = new Bus(4, 60, 4, "DATCO", 3400, 10, 30, 100);
        print(v);
        
        v = new Bus(8, 80, 8, "DATCO", 4800, 12, 34, 80);
        print(v);
        
        v = new Bus(4, 30, 4, "DATCO", 2400, 10, 20, 100);
        print(v);
    }
    
    // Function "alias". I didn't feel like typing 'System.out.println' 7 times.
    public static void print(Object s)
    {
        System.out.println("\n" + s);
    }
}
