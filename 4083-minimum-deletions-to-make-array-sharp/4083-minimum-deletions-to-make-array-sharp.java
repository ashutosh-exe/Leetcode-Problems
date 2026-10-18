class Solution {
    public int minDeletions(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++){
            int xor = nums[i]^nums[i-1];
            if(xor==0){
                count++;
            }
        }
        return count;
    }
}