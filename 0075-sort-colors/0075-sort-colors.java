class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            if(nums[i]==1){
                oneCount++;
            }
            else{
                twoCount++;
            }
        }
        for(int i=0;i<zeroCount;i++){
            arr[i] = 0;
        }
        for(int i=zeroCount;i<oneCount+zeroCount;i++){
            arr[i] = 1;
        }
        for(int i=oneCount+zeroCount;i<nums.length;i++){
            arr[i] = 2;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
    }
}