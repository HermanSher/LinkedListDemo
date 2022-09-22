import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListDemo{

        public static void main(String[] args) {
                LinkedList <String> ll = new LinkedList<String>();
                System.out.println("Initial list of element: "+ll);
                ll.add("Fahyien");
                ll.add("Farhan");
                ll.add("Rehan");
                System.out.println("After invoking add(E e) method: "+ ll);
                //Adding an element at the specific position
                ll.add(1,"Hermann");
                System.out.println("After invoking add(int index,E element) method: "+ll);
                LinkedList <String> ll2 = new LinkedList<String>();
                ll2.add("Rashid");
                ll2.add("Afroz");
                //Adding second list elements to the first list
                ll.addAll(ll2);
                System.out.println("After invoking addAll(Collection<?extends E>c) method: "+ll);
                LinkedList <String> ll3 = new LinkedList <String>();
                ll3.add("Anique");
                ll3.add("Insha");
                //Adding Second list elements to the first list at specific position
                ll.addAll(1,ll3);
                System.out.println("After invoking addAll(int index,collection<?extends E>c) method: "+ll);
                //Adding an element at the first position
                ll.addFirst("Rocket");
                System.out.println("After invoking addFirst(E e) method: "+ll);
                //Adding an element at the last position
                ll.addLast("Katappa");
                System.out.println("After invoking addlast(E e) method: "+ll);
        }




}