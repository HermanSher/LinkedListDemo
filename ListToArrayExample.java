/*We can convert the List to Array by calling the list.toArray() method. Let's see a simple example to convert list elements into array. */

import java.util.*;

public class ListToArrayExample {
        public static void main(String args[]) {
                List<String> fruitList = new ArrayList<>();
                fruitList.add("Mango");
                fruitList.add("Banana");
                fruitList.add("Apple");
                fruitList.add("Strawberry");
                // Converting ArrayList to Array
                String[] array = fruitList.toArray(new String[fruitList.size()]);
                System.out.println("Printing Array: " + Arrays.toString(array));
                System.out.println("Printing List: " + fruitList);
        }
}