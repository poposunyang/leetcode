class Solution26 {
    public int removeDuplicates(int[] nums) {
        int before = 0;
        int after = 1;
        int len = nums.length;
        int count = len;
        for (int i = 1; i < len; i++) {
            if (nums[before] == nums[after]) {
                after++;
                count--;
            } else {
                nums[before + 1] = nums[after];
                before++;
                after++;
            }
        }
        return count;
    }
}