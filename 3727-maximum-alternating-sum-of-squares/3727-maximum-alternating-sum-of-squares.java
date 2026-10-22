class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] *= nums[i];
        }
        int n = nums.length;
        Arrays.sort(nums);
        long sum = 0;
        for(int i=0;i<n/2;i++){
            sum -= nums[i];
        }
        for(int i=n/2;i<n;i++){
            sum += nums[i];
        }
        return sum;
    }
}