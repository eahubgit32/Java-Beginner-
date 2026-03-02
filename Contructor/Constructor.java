package Contructor;

public class Constructor {
    
    public static void main(String[] args){

        final Dog newDog = new Dog();

        newDog.age = 16;
        newDog.name = "Boss";
 
        //newDog.Bark();

        Cat.Meow("Kitty", 2);
    }

}
