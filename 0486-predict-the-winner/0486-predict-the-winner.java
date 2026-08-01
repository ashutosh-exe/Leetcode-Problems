class Solution {
    public boolean predictTheWinner(int[] nums) {
        int player1adv = currPlayerAdv(nums,0,nums.length-1);
        if(player1adv>=0){
            return true;
        }
        return false;
    }
    private int currPlayerAdv(int[] nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int leftchoose = nums[left]-currPlayerAdv(nums,left+1,right);
        int rightchoose = nums[right]-currPlayerAdv(nums,left,right-1);

        return Math.max(leftchoose,rightchoose);
    }
}