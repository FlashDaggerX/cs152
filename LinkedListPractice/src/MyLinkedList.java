public class MyLinkedList<T>
{
    private Node index;

    public MyLinkedList()
    {
        this.index = new Node();
    }

    public void link(T element)
    {
        index.data = element;
        index.next = new Node();

        Node previous = index;
        forward();
        index.previous = previous;
    }

    public T element()
    {
        return index.data;
    }

    public boolean forward()
    {
        if (!index.isLastElement())
        {
            index = index.next;
            return true;
        }

        return false;
    }

    public boolean backward()
    {
        if (!index.isFirstElement())
        {
            index = index.previous;
            return true;
        }

        return false;
    }

    class Node
    {
        public Node previous, next;
        public T data;

        public Node(T data)
        {
            this.data = data;
        }

        public Node()
        {
            this(null);
        }

        public boolean isFirstElement()
        {
            return previous == null;
        }

        public boolean isLastElement()
        {
            return next == null;
        }
    }
}