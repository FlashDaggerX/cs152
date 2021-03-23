/**
 * @author (Kyle Guarco)
 * @version (July 12, 2020)
 */
public class House
{
    // 'cost' is given in thousands of dollars
    private int houseNumber, bedrooms, sqFeet, year, cost;
    
    public House(int houseNumber, int bedrooms, int sqFeet, int year, int cost)
    {
        this.houseNumber = houseNumber;
        this.bedrooms = bedrooms;
        this.sqFeet = sqFeet;
        this.year = year;
        this.cost = cost;
    }
    
    @Override
    public String toString()
    {
        return String.format("House #%d\t Bedrooms: %d\t Square Feet: %d\t Year: %d\t Cost: %d\t",
                houseNumber, bedrooms, sqFeet, year, cost);
    }
    
    public boolean isNew()
    {
        return year >= 2000;
    }
    
    public boolean isExpensive()
    {
        return cost > 300;
    }
    
    public int getCost()
    {
        return cost;
    }
}
