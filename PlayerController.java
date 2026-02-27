import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerController {
    
    static class Players{
        public String name;
        public int level;


        Players(String name, int level){
            this.name = name;
            this.level = level;
        }
    }

    public List<Players> getHighLevelPlayers(){
        ArrayList<Players> players = new ArrayList<>();
        players.add(new Players("Sky", 60) );
        players.add(new Players("Luna", 45) );
        players.add(new Players("Nova", 70));
        players.add(new Players("Orion", 55) );
        players.add(new Players("Stella", 80));

        return players.stream()
            .filter(p -> p.level > 50)
            .collect(Collectors.toList());
    }
}
