class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        int low = 0;
        int high = 0;

        while(high<nums.length){
            sum += nums[high];
            high++;
            while(sum>=target){
                int currLen = high-low;
                minLen = Math.min(currLen,minLen);

                sum -= nums[low];
                low++;
            }
        }

        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;

    }
}