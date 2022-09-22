import java.util.*;

public class App {
    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Hermann");
        ll.add("Fahyien");
        ll.add("Dilnawaz");
        // Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
