import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArrayList {
    
    public static void main(String[] ar){

        //String[] animals = {"Dog", "Cat", "Meow", "Woof"};

        //ArrayList<String> animArrayList = new ArrayList<>();
        ArrayList<String> animArrayList2 = new ArrayList<>(Arrays.asList("Tiger", "Elephant", "Cow", "Goat"));

        System.out.println(animArrayList2);

        animArrayList2.remove("Cow");
        System.out.println(animArrayList2);

        animArrayList2.add("Eagle");
        System.out.println(animArrayList2);
        
        System.out.println(animArrayList2.contains("Tiger"));

        animArrayList2.removeAll(animArrayList2);
        System.err.println(animArrayList2);

    }
}
