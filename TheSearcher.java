import java.util.ArrayList;
import java.util.Arrays;

public class TheSearcher {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 25, 30, 45, 50));

        for (Integer num : list){ // For each loop Acts like a Conveyor Belt Stream that passess through all the list.
            if (num > 30){
                System.out.println("Found a high value: " + num);
            }
        }
    }
}
