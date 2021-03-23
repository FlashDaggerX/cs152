import java.util.ArrayList;

/**
 * @author (Kyle Guarco)
 * @version (July 12, 2020)
 */
public class HouseComplex
{
    public String toStringRec(House[] list, int n)
    {
        if (n < 1)
            return "";
        
        return toStringRec(list, n - 1) + "\n" + list[n - 1];
    }
    
    public void printExpensiveHousesRec(House[] list, int n)
    {
        if (n < 1)
            return;
        
        printExpensiveHousesRec(list, n - 1);
        
        House house = list[n - 1];
        if (house.isExpensive())
            System.out.println(house);
    }
    
    public int countNewHousesRec(House[] list, int n)
    {
        if (n < 1)
            return 0;
        
        int add = list[n - 1].isNew() ? 1 : 0;
        
        return countNewHousesRec(list, n - 1) + add;
    }
    
    public House cheapestHouseRec(House[] list, int n)
    {
        if (n < 1)
            return null;

        House house = list[n - 1];
        House funcHouse = cheapestHouseRec(list, n - 1);
        
        if (funcHouse == null)
            return house;
        
        return funcHouse.getCost() > house.getCost() ? house : funcHouse;
    }
}
