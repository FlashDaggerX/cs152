/**
 * This class represents the basic idea of anything that can 
 * transport people on land.
 * 
 * @author (Kyle Guarco)
 * @version (July 13, 2020)
 */
public abstract class Vehicle
{
    private String make;
    private int weight, height, length;
    private int maxSpeed, maxPassengers;
    
    public Vehicle(String make, int weight, int height, int length, int maxSpeed, int maxPassengers)
    {
        this.make = make;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
    }
    
    @Override
    public String toString()
    {
        return String.format("Make: %s\t Weight: %d\t Height: %d\t Length: %d\n" + 
                             "Max Speed: %d\t Max Passengers: %d\n",
                             make, weight, height, length, maxSpeed, maxPassengers);
    }
}
