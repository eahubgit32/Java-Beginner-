package Challenges;
import java.util.Scanner;

public class FindTheWord {
    
    public static void main(String[] args){

        String word = "Is the word present in the String?";
        
        //System.out.println("Please enter a word");

        Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.nextLine();

        while(true){
            System.out.println("Please enter a word");
            String userInput = scanner.nextLine();

            if(userInput.trim().isEmpty()){
                System.out.println("You did not enter anything");
            }
            else if(word.toLowerCase().contains(userInput.toLowerCase())){
                System.out.println("You found a match word!");
                break;
            }
            else{
                
                System.out.println("Did not found a match word yet Try again.");
            }
        }
        scanner.close();
    }
}
