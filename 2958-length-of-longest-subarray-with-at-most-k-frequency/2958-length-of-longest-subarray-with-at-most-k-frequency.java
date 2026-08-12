class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int start = 0;
        int ans = 0;
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.get(nums[end])>k && start<nums.length){
                map.put(nums[start],map.get(nums[start])-1);
                start++;
            }
            ans = Math.max(ans,end-start+1);
        }
        return ans;
    }
}