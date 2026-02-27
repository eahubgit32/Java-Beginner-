import java.util.ArrayList;
import java.util.Arrays;

public class StreamFunction {
    
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 25, 30, 45, 50));

        numbers.stream() // Creates a Stream from the ArrayList
            .filter(num -> num < 30) // Filters the stream to include only numbers greater than 30
            .forEach(num -> System.out.println("Found a low value Less Than 30: " + num)); // Prints each remaining number
    }
}
