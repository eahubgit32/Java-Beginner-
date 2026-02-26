public class SelectiveCounter {
    public static void main(String[] args){


        for(int number = 1; number <= 10; number++ ){
            if(number == 4 ){
                continue;
            }
            else if(number == 9){
                break;
            }
            System.out.println(number);
        }
    }
}
