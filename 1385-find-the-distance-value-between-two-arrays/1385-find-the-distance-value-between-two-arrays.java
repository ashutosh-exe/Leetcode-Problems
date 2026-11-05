class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int num:arr1){
            if(isValid(num,arr2,d)){
                count++;
            }
        }
        return count;
    }
    private boolean isValid(int n,int[] arr,int d){
        for(int num:arr){
            if(Math.abs(num-n)<=d){
                return false;
            }
        }
        return true;
    }
}