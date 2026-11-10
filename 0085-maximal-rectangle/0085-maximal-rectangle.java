class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    heights[j] += 1;
                }
                else{
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(largestRectangleArea(heights),maxArea);
        }
        return maxArea;
    }
    private int largestRectangleArea(int[] arr){
        int n = arr.length;
        int[] left = nextSmallerElement(arr);
        int[] right = previousSmallerElement(arr);
        int maxArea = 0;
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea,arr[i]*(right[i]-left[i]-1));
        }
        return maxArea;
    }
    private int[] nextSmallerElement(int[] arr){
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
    private int[] previousSmallerElement(int[] arr){
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