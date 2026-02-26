public class ArraySelectiveCounter {

    public static void main(String[] args){

        int[] numberOfArrays = {10, 20, 30, 40, 50};
        for(int numberOfArray : numberOfArrays ){
            if(numberOfArray == 30){
                continue;
            }
            else if(numberOfArray >= 45){
                break;
            }
            System.out.println(numberOfArray);
        }
    }
}
