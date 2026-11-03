class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){
            max = Math.max(num,max);
            sum += num;
        }
        return max*nums.length-sum;
    }
}