class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> seen = new HashSet<>(nums.length);
        for(int num:nums){
            seen.add(num);
        }
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum += nums[i];
            }
            else{
                break;
            }
        }
        while(seen.contains(sum)){
            sum++;
        }
        return sum;
    }
}