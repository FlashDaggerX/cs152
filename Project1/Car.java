/**
 * @author (Kyle Guarco)
 * @version (July 6, 2020)
 */
public class Car 
{
    private String vin, make, model;
    private double price;
    private int year;

    public Car(String vin, String make, String model, double price, int year)
    {
        this.vin = vin;
        this.make = make;
        this.model = model;

        this.price = price;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return String.format("VIN%s\t%s\t%s\t$%.2f\t%d",
                vin, make, model, price, year);
    }

    public String getMake()
    {
        return make;
    }

    public int getYear()
    {
        return year;
    }

    public boolean isExpensive()
    {
        return price > 30000;
    }

    public boolean isAntique()
    {
        return year < 1968;
    }
}