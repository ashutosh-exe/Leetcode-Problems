class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int greatest = nums[0];
        for(int i=1;i<nums.length;i++){
            greatest = Math.max(greatest,nums[i]);
            smallest = Math.min(smallest,nums[i]);
        }
        return gcd(smallest,greatest);
    }
    private int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}