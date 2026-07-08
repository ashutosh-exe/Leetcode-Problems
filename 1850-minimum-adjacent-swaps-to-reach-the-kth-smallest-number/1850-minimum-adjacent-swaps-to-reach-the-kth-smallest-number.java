class Solution {
    public int getMinSwaps(String num, int k) {
        char[] arr = num.toCharArray();
        int n = arr.length-1;
        for(int j=1;j<=k;j++){
            nextPermutation(arr,n);
        }
        int swaps = 0;
        char[] og = num.toCharArray();
        for(int i=0;i<og.length-1;i++){
            int j=i;
            while(og[j]!=arr[i]){
                j++;
            }
            while(j>i){
                swap(og,j,j-1);
                j--;
                swaps++;
            }
        }
        return swaps;
    }
    private void nextPermutation(char[] arr,int n){
        int idx = -1;
        for(int i=n;i>0;i--){
            if(arr[i]>arr[i-1]){
                idx = i-1;
                break;
            }
        }
        if(idx == -1){
            reverse(arr,0,n);
            return;
        }
        for(int i=n;i>idx;i--){
            if(arr[idx]<arr[i]){
                swap(arr,i,idx);
                break;
            }
        }
        reverse(arr,idx+1,n);
    }
    private void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(char[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}