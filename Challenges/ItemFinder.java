package Challenges;
import java.util.Scanner;
public class ItemFinder {
    
    public static void main(String[] args){

        String[] computerProucts = {"Laptop", "Phone", "Tablet", "Monitor", "Keyboard"};

        System.out.println("Type a product");
        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();
        
        //String target = "Monitor";
        boolean found = false;
        // for(String product : computerProucts){

                
        //     if(product == computerProucts){
        //         System.out.println("Item found at index: " + [product]);
        //     }else{
        //         System.out.println("Did not found on the list");
        //     }
        //}

        // for(int i = 0; i < computerProucts.length; i++) {
            
        //     if(computerProucts[i].equals(target)){
        //         System.out.println("Item found at index " + i);
        //         found = true;
        //         break;
        //     }
        //     // else{
        //     //     System.out.println("Did not found in index " + i);
        //     // }
        // }
        // if(!found){
        //     System.out.println("Did not found in any index");
        // }

        int i = 0;
        while(i < computerProucts.length){
            if(computerProucts[i].equals(target)){
                System.out.println("Item found at index " + i);
                break;
            }if (!found){
                System.out.println("Item not found in any index");
            }
            i++;

        }
    }
}
