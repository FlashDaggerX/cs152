/**
 * @author (Kyle Guarco)
 * @version (July 20, 2020)
 */
public class Employee
{
    private String id, name, department;
    private int salary;
    
    public Employee(String id, String name, String department, int salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String toString() 
    {
        return String.format("[ID %s] Name: %s\t Department: %s\t Salary: %d",
                             id, name, department, salary);
    }
    
    public int getSalary()
    {
        return salary;
    }
}
