class Solution {
    public String getPermutation(int n, int k) {
        char[] nums = new char[n];
        for(int i=1;i<=n;i++){
            nums[i-1] = String.valueOf(i).charAt(0);
        }
        for(int i=1;i<k;i++){
            nextPermutation(nums);
        }
        String ans = String.valueOf(nums);
        return ans;
    }
    private void nextPermutation(char[] nums){
        int idx = -1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx = i-1;
                break;
            }
        }
        if(idx == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,nums.length-1);
    }
    private void reverse(char[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    private void swap(char[] nums,int i,int j){
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}