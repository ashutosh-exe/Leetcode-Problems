class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            int idx = 0;
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                idx = st.pop();
                ans[idx] = i-idx;
            }
            st.push(i);
        }
        return ans;
    }
}