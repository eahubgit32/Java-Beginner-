package Collections;


//import java.util.HashMap;
import java.util.LinkedHashMap;

public class CollectionPractice {
    
    public static void main(String[] args){

        //hashMapCollection();
    }
    // public static void arrayListCollection(String[] names){
    //     List nameCollection = new ArrayList<>();
    // }

    public static void hashMapCollection(){

        //HashMap<String, Integer> nameCollection = new HashMap<>();
        LinkedHashMap<String, Integer> nameCollection = new LinkedHashMap<>();
        nameCollection.put("Karl", 18);
        nameCollection.put("Diane", 14);
        nameCollection.put("Jeric", 25);
        nameCollection.put("Manny", 23);
        
        // for (var name: nameCollection.entrySet()){
        //     System.out.println("The employee name for " + name.getKey() + "is" + name.getValue());
        

        nameCollection.forEach((key, value) -> {
            System.out.println("The employee name for " + key + " is " + value);
        });
        //System.out.println("The employee name for " + nameCollection.get("Karl") + " is ");
    }
}

