class Solution {

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};

        Solution sol = new Solution();
        int[] result = sol.runningSum(nums);

    }

    public int[] runningSum(int[] nums) {  

        for(int i = 1; i < nums.length -1; i++){
            nums[i] += nums[i - 1];
            System.out.println("Index " + i + " is now " + nums[i]);
        }
        return nums;
    }
}