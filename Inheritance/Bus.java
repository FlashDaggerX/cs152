/**
 * @author (Kyle Guarco)
 * @version (July 13, 2020)
 */
public class Bus extends Vehicle
{
    private int numberDoors, numberSeats, numberAxels;
    
    public Bus(int numberDoors, int numberSeats, int numberAxels,
               String make, int weight, int height, int length, int maxSpeed)
    {
        // On a bus, the maximum amount of passengers is equal to the number of seats.
        // So for 'Bus', we'll pass the number of seats into the parent constructor.
        super(make, weight, height, length, maxSpeed, numberSeats);
        
        this.numberDoors = numberDoors;
        this.numberSeats = numberSeats;
        this.numberAxels = numberAxels;
    }
    
        @Override
    public String toString()
    {
        return String.format("Type: Bus\t #Doors: %d\t #Seats: %d\t #Axels: %d\n", 
                             numberDoors, numberSeats, numberAxels)
                             // Call Vehicle.toString() and append it to the final string here.
                             + super.toString();
    }
}
