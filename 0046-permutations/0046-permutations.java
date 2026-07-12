class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(convertToList(nums));
        int fact=1;
        for(int i=1;i<=nums.length;i++){
            fact *= i;
        }
        for(int i=1;i<=fact-1;i++){
            nextPermutation(nums);
            ans.add(convertToList(nums));
        }
        return ans;
    }
    private List<Integer> convertToList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }
    private void nextPermutation(int[] nums){
        int idx = -1;
        int n = nums.length-1;
        for(int i=n;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx = i-1;
                break;
            }
        }
        if(idx == -1){
            reverse(nums,0,n);
            return;
        }
        for(int i=n;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,idx,i);
                break;
            }
        }
        reverse(nums,idx+1,n);
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}