class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 2*n-1;i>=0;i--){
            int idx = i%n;
            while(!st.isEmpty() && nums[idx]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[idx] = -1;
            }
            else{
                ans[idx] = st.peek();
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}