class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int maxT = threshold * k;
        int count = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        if(sum>=maxT){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i];
            sum = sum - arr[i-k];

            if(sum>=maxT){
                count++;
            }
        }
        return count;
    }
}