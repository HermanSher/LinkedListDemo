
/*We can convert the Array to List by traversing the array and adding the element in list one by one using list.add() method. Let's see a simple example to convert array elements into List. */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayList {

        public static void main(String args[]) {
                // Creating Array
                String[] array = { "Java", "Python", "PHP", "C++" };
                System.out.println("Printing Array: " + Arrays.toString(array));
                // Converting Array to List
                List<String> list = new ArrayList<String>();
                for (String lang : array) {
                        list.add(lang);
                }
                System.out.println("Printing List: " + list);

        }
}