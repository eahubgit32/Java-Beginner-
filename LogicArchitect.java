import java.util.ArrayList;


public class LogicArchitect {
    

        protected static class Players{

        String name;
        int level;
        void shoutName(){
            System.out.println("High-Level Player: " + name);
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Players> players = new ArrayList<>();
        players.add(new Players() {{ name = "Sky"; level = 60; }});
        players.add(new Players() {{ name = "Luna"; level = 45; }});
        players.add(new Players() {{ name = "Nova"; level = 70; }});
        players.add(new Players() {{ name = "Orion"; level = 55; }});
        players.add(new Players() {{ name = "Stella"; level = 80; }});

        players.stream()
            .filter(p -> p.level > 50) // Filters players with level greater than 50
            .forEach(p -> p.shoutName());
    }


    
}
