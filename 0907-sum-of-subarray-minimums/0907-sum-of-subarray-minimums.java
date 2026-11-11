class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] left = previousSmallerElement(arr);
        int[] right = nextSmallerOrEqual(arr);
        int mod = 1_000_000_007;

        long sum = 0;
        for(int i=0;i<arr.length;i++){
            long count =(long)(i-left[i])*(right[i]-i);
            sum = (sum+count*arr[i]) % mod;
        }
        return (int)sum;
    }
    private int[] previousSmallerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
 
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
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
    private int[] nextSmallerOrEqual(int[] arr){
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