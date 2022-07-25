class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int length = accounts.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            int sum = arraySum(accounts[i]);
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public int arraySum(int[] accountArray) {
        int length = accountArray.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += accountArray[i];
        }
        return sum;
    }
}