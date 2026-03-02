public class TestingFile {


    public static void main(String[] args){

        int[] arrayofNumbers = {10, 20, 30, 40, 60, 70};
        int target = 70;

        int result = TestingFile.binarySearch(arrayofNumbers, target);

        if (result == -1 ){
            System.out.println("Target is not on the list of arrays");
        }else{
            System.out.println("Index is at: " + result);
        }
    }


    public static int binarySearch(int[] nums, int numberToFind){
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int middlePosition = low + (high - low) / 2;
            int middleNumber = nums[middlePosition];

            if (numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition - 1;
            }else{
                low = middlePosition + 1;
            }
        }
        return -1;
    }



}
