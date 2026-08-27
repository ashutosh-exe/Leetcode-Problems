class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int rem = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            rem = sum%k;
            if(rem==0 && i>0){
                return true;
            }
            if(map.containsKey(rem)&&i-map.get(rem)>1){
                return true;
            }
            if(!map.containsKey(rem)){
                map.put(rem,i);
            }
        }
        return false;
    }
}