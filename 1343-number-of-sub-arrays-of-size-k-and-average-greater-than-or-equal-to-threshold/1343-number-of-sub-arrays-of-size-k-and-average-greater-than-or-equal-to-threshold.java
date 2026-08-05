class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int maxT = threshold*k;
        int count = 0;
        int low=0;
        int high = k;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=maxT){
            count++;
        }
        while(high<arr.length){
            sum = sum+arr[high]-arr[low];
            if(sum>=maxT){
                count++;
            }
            low++;
            high++;
        }
        return count;
    }
}