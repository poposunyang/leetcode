class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        System.out.println(nums.length);
        int sum =0;
        for(int i=0; i < nums.length; i++){
            runningSum[i] = sum + nums[i];
            sum += nums[i];
        }
        return runningSum;  
    }
}
