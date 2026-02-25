import java.util.Scanner;

class SwitchCase{
    
    public static void main(String[] args){
        
        System.out.println("Enter A number: ");
        try (Scanner input = new Scanner(System.in)) {
            String text = input.nextLine();
            
            switch(text){
                case "Start":
                    System.out.println("Device Started");
                    break;
                case "Stop":
                    System.out.println("Device Stopped");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
