/**
 * @author (Kyle Guarco)
 * @version (July 13, 2020)
 */
public class Car extends Vehicle
{
    private boolean isConvertable;
    
    public Car(boolean isConvertable, 
               String make, int weight, int height, int length, int maxSpeed, int maxPassengers)
    {
        super(make, weight, height, length, maxSpeed, maxPassengers);
        
        this.isConvertable = isConvertable;
    }
    
    @Override
    public String toString()
    {
        return String.format("Type: Car\t Is Convertable: %b\n", isConvertable)
                             // Call Vehicle.toString() and append it to the final string here.
                             + super.toString();
    }
}
