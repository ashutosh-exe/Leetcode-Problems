class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] dp = new int[n];
        java.util.Arrays.fill(dp,Integer.MAX_VALUE);
        
        int start = 0;
        int sum = 0;
        int minLenSoFar = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        
        for(int end=0;end<n;end++) {
            sum += arr[end];
            
            while(sum>target) {
                sum -= arr[start];
                start++;
            }
            
            if(sum == target){
                int currLen = end-start+1;
                if (start>0 && dp[start-1] != Integer.MAX_VALUE) {
                    res = Math.min(res,currLen + dp[start-1]);
                }
                
                minLenSoFar = Math.min(minLenSoFar, currLen);
            }
            
            dp[end] = minLenSoFar;
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}