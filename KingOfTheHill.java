public class KingOfTheHill {

    public static void main(String[] args){
        int[] heights = {5, 8, 2, 10, 3, 9, 1};

        int max = heights[0];
        int position = 0;

        for (int i = 1; i < heights.length; i++){
            if(heights[i] > max){
                max = heights[i];
                position = i;
            }
        }
        System.out.println("The tallest person is " + max + " at index " + position);
    }    
    
}
