class Player{

    String name;
    int level;

    void shoutName(){
        System.out.println("My Name is: " + name);
    }
}


class ObjectOriented{

    public static void main(String[] args){

        Player p1 = new Player();

        p1.name = "Sky";
        p1.level = 96;

        p1.shoutName();
    }

}