public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        for (String s : new String[]{ "a", "b", "c", "d", "e" })
        {
            list.link(s);
        }

        while (list.backward())
        {
            System.out.print(list.element());
        }

        System.out.println();
        while (list.forward())
        {
            System.out.print(list.element());
        }
    }
}