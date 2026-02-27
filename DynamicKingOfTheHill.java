import java.util.ArrayList;


public class DynamicKingOfTheHill {
    
    public static void main(String[] args){

        ArrayList<String> team = new ArrayList<>();

        team.add("Sky2");
        team.add("Storm");
        team.add("Cloud");
    
        team.remove("Sky2");
        System.out.println(team.size());
        System.out.println(team.get(0));
    }
}
