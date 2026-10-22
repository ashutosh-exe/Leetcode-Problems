class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int num = nums[i];
            while(num!=0){
                if(num%10==digit){
                    count++;
                }
                num = num/10;
            }
        }
        return count;
    }
}