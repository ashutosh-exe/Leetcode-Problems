class Solution {
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private boolean isDescending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    private void reverse(int[] arr,int start,int end) {
        while (start < end) {
        swap(arr, start, end);
        start++;
        end--;
    }
}
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length-1;
        for(int i=n;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx = i-1;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,n);
            return;
        }
        for(int i=n;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,n);
    }
}