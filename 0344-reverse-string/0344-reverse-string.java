class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    private void swap(char[] arr,int start,int end){
        char temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}