class Solution {
    public long gcdSum(int[] nums) {
        int[] max = new int[nums.length];
        int m = nums[0];
        int[] prefix = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=m){
                m = nums[i];
            }
            max[i] = m;
        }
        for(int i=0;i<nums.length;i++){
            prefix[i] = gcd(nums[i],max[i]);
        }
        Arrays.sort(prefix);
        int start = 0;
        int end = prefix.length-1;
        long ans = 0;
        while(start<end){
            ans = ans+gcd(prefix[start],prefix[end]);
            start++;
            end--;
        }
        return ans;
    }
    private int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
        }
    return a;
    }
}