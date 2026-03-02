package NumberGuessingGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args){

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;

        while(true){

            System.out.println("Enter a number from 1 - 100");
            int userInput = scanner.nextInt();

            if(userInput == randomNumber){
                System.out.println("You have picked the right Number");
                break;
            }else if(userInput > randomNumber){
                System.out.println("Your Guessed Number is High. Guess again.");
            }else{
                System.out.println("Your Guessed Numbers is Low. Guess Again");
            }
        }
    }
}
