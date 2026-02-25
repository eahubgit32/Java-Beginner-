public class ForLoops {

    public static void main(String[] args) {

        for (int number = 1; number <= 20; number++){
            if(number % 2 ==0){
                System.out.println("Number "+ number + " is Even");
            }else if(number == 7){
                System.out.println("Number "+ number +" is Lucky!");
            }else{
                System.out.println("Number "+ number + " is Odd");
            }
        }
    }
    
}
