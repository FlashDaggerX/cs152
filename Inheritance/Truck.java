/**
 * @author (Kyle Guarco)
 * @version (July 13, 2020)
 */
public class Truck extends Vehicle
{
    private int maxWeightLoad;
    
    public Truck(int maxWeightLoad, 
                 String make, int weight, int height, int length, int maxSpeed, int maxPassengers)
    {
        super(make, weight, height, length, maxSpeed, maxPassengers);
        
        this.maxWeightLoad = maxWeightLoad;
    }
    
    @Override
    public String toString()
    {
        return String.format("Type: Truck\t Weight Limit: %d\n", maxWeightLoad)
                             // Call Vehicle.toString() and append it to the final string here.
                             + super.toString();
    }
}
