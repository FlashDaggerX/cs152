/**
 * @author (Kyle Guarco)
 * @version (July 20, 2020)
 */
public class TestList
{
    public static void main(String[] args)
    {
        LLEmployee list1 = new LLEmployee();
        LLEmployee list2 = new LLEmployee();
        
        { // Body that holds local variables 'rawList1' and 'rawList2'.
          // Used to populate the above linked lists.
          Employee[] rawList1 = {
              new Employee("101", "Lewis", "CS ", 76),
              new Employee("103", "Jones", "CS ", 80),
              new Employee("107", "Marcus", "BIO", 59),
              new Employee("108", "Smith", "BIO", 90),
              new Employee("109", "Zee", "CS ", 77)
          };
          for (Employee emp : rawList1)
              list1.addRear(emp);
          
          Employee[] rawList2 = {
              new Employee("107", "Marcus", "BIO", 59),
              new Employee("101", "Lewis", "CS ", 76),
              new Employee("109", "Zee", "CS ", 77),
              new Employee("103", "Jones", "CS ", 80),
              new Employee("108", "Smith", "BIO", 90)
          };
          for (Employee emp : rawList2)
              list2.addRear(emp);
        }
        
        System.out.println("Linked List 1:");
        list1.printLinkedList();
        
        System.out.println("\nLinked List 2:");
        list2.printLinkedList();
        
        System.out.println("\nSum of employee salaries for list1 and list2: ");
        System.out.printf("\tList1 Salary: $%.2f\t List2 Salary: $%.2f\n", 
                list1.sumSalaries(), list2.sumSalaries());

        System.out.println("\nAre either lists sorted by salary? (descending order) ");
        System.out.printf("\tList1: %b\t List2: %b\n",
                list1.isSortedBySalaryRec(list1.getList()),
                list2.isSortedBySalaryRec(list2.getList()));
        
        System.out.println("\nHighest paid employees in list1 and list2: ");
        System.out.println("List1: " + list1.highestPaidEmpRec(list1.getList()).toString());
        System.out.println("List2: " + list2.highestPaidEmpRec(list2.getList()).toString());
    }
}
