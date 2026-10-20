class Solution {
    public boolean judgeSquareSum(int c) {
        long j =(long) Math.sqrt(c);
        long i = 0;
        while(i<=j){
            long sum = i*i + j*j;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}