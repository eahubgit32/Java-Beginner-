class BasicSyntax{


    public static void main(String[] args){

        String name = "Sky";
        int level = 96;
        double healthPercentage = 100.0; 
        boolean alive = true;
        int experiencePoints = 0;

        while(experiencePoints < 100 ){
            
            experiencePoints += 20;

            if(experiencePoints >= 100){         // Here needs practice
                System.out.println("LEVEL UP!");
            }
        }



        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + healthPercentage + "%");
        System.out.println("Is Alive: " + alive);
        System.out.println("Level: " + experiencePoints);
    }

}