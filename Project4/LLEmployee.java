/**
 * @author (Kyle Guarco)
 * @version (July 20, 2020)
 */
public class LLEmployee
{
    private Node list; 

    public LLEmployee()
    {
        this.list = null;
    }

    public void addRear(Employee emp)
    {
        Node newNode = new Node(emp);

        if (list == null)
        {
            list = newNode;
            return;
        }

        newNode.next = list;
        list = newNode;
    }

    public void printLinkedList()
    {
        Node n = list;
        while (n != null)
        {
            System.out.println(n.data);

            n = n.next;
        }
    }

    public double sumSalaries()
    {
        double sum = 0d;

        Node n = list;
        while (n != null)
        {
            sum += n.data.getSalary();

            n = n.next; 
        }

        return sum;
    }

    /*
     * Though it isn't specifed in the assignment documentation, this function should be 
     * able to figure out whether the list is sorted in descending order (largest -> smallest).
     * 
     * This is implied when looking at the 'list2' layout, and also assuming the test should 
     * return at least one true value.
     */
    public boolean isSortedBySalaryRec(Node first)
    {
        if (first.next == null) 
            return true;

        Employee current = first.data,
        next = first.next.data;
        boolean sorted = current.getSalary() > next.getSalary();

        return sorted && isSortedBySalaryRec(first.next);
    }

    public Employee highestPaidEmpRec(Node first)
    {
        if (first.next == null)
            return first.data;
            
        Employee emp = first.data;
        Employee empNext = highestPaidEmpRec(first.next);

        return (emp.getSalary() < empNext.getSalary()) ? empNext : emp;
    }

    public Node getList()
    {
        return list;
    }

    class Node 
    {
        public Employee data;
        public Node next;

        public Node(Employee data)
        {
            this.data = data;
            this.next = null;
        }
    }
}
