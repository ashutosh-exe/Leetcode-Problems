class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int countOdd = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                countOdd++;
            }
        }
        for(int i=ans.length-countOdd;i<ans.length;i++){
            ans[i] = 1;
        }
        return ans;
    }
}