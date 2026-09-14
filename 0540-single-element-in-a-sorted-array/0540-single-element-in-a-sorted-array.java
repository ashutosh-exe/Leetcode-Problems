class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int start = 1;
        int end = nums.length-2;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] != nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2==1 && nums[mid]==nums[mid+1] || mid%2==0 && nums[mid]==nums[mid-1]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}