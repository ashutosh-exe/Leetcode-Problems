class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len = 1;
        int maxLen = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                len++;
            }
            else{
                len = 1;
            }
            maxLen = Math.max(len,maxLen);
        }
        len = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                len++;
            }
            else{
                len = 1;
            }
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}