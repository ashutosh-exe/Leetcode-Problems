class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = previousSmallerElement(heights);
        int[] right = nextSmallerElement(heights);
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea,heights[i]*(right[i]-left[i]-1));
        }
        return maxArea;
    }
    private int[] previousSmallerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
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
    private int[] nextSmallerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
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