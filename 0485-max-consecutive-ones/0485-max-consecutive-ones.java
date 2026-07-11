class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        int left=0;
        int right=0;
        int ans = 0;
        int maxAns = 0;
        while(right<nums.length){
            if(nums[right]!=1){
                left = right+1;
            }
            right++;
            ans = right-left;
            if(ans>maxAns){
                maxAns = ans;
            }
        }
        return maxAns;
    }
}