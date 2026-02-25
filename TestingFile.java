public class TestingFile {

    public static void main(String[] args){

        int[] arraysOfBinaries = {2, 3, 4, 4, 5, 1,};

        System.out.println("Index found at: " + BinarySearch(arraysOfBinaries, 8));

    }

    public static int BinarySearch(int[] numbers, int numberToFind){

        int low = 0;
        int high = numbers.length - 1;

        while(low <= high){
            int middlePosition = (low + high) /2;
            int middleNumber = numbers[middlePosition];

            if(middlePosition == middleNumber){
                return middlePosition;
            }
            if(middlePosition < middleNumber){
                high = middlePosition - 1;
            }else{
                low = middlePosition + 1;
            }
        }
        return -1;
    }
    
}
