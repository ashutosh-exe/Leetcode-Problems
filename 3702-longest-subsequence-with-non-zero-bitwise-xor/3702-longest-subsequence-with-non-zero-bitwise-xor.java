class Solution {
    public int longestSubsequence(int[] nums) {
        int[] zeroes = new int[nums.length];
        if(Arrays.equals(nums,zeroes)){
            return 0;
        }
        int x=0;
        for(int num:nums){
            x^=num;
        }
        if(x!=0){
            return nums.length;
        }
        else{
            return nums.length-1;
        }
    }
}