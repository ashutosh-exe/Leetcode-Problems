class Solution {
    public long subArrayRanges(int[] nums) {
        int[] ps = previousSmaller(nums);
        int[] ns = nextSmallerOrEqual(nums);
        int[] pg = previousGreater(nums);
        int[] ng = nextGreaterOrEqual(nums);

        long min = 0;
        long max = 0;

        for(int i=0;i<nums.length;i++){
            min += (long)nums[i]*(i-ps[i])*(ns[i]-i);
            max += (long)nums[i]*(i-pg[i])*(ng[i]-i);
        }
        return max-min;
    }
    private int[] previousSmaller(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    private int[] nextSmallerOrEqual(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    private int[] previousGreater(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    private int[] nextGreaterOrEqual(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = n;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}