class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum=0;
        int minLength = Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++){
            sum += nums[end];
            while(sum>=target){
                int len = end-start+1;
                sum -= nums[start];
                start++;
                minLength = Math.min(len,minLength);
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
}