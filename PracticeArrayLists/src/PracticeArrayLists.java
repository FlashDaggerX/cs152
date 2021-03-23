import java.util.ArrayList;

/**
 * @author Kyle Guarco
 */
public class PracticeArrayLists {

    public static void main(String[] args) 
    {
        System.out.print("\n Number List: ");
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= 12; i++)
            numberList.add(i*i);
        for (int i : numberList)
            System.out.print(i + " ");
        
        System.out.print("\n Boolean List: ");
        ArrayList<Boolean> booleanList = new ArrayList<>();

        for (int i = 1; i <= 30; i++) 
            // If 'i' is an even number, append 'true' to the list. Append 'false' otherwise.
            booleanList.add(i % 2 == 0);
        for (boolean b : booleanList)
            System.out.print(b + " ");
        
        System.out.print("\n Town List: ");
        ArrayList<String> townList = new ArrayList<>();

        for (String s : new String[]{"Paris", "London", "Athens", "Rome"})
            townList.add(s);
        for (String s : townList)
            System.out.print(s + " ");
        
        System.out.println("\n Done!");
    }
}
