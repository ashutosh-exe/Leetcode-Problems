class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return n;
        }
        int sumEven = n*(n+1);
        int sumOdd = n*n;
        int gcd = 0;
        for(int i=1;i<sumOdd;i++){
            if(sumEven%i==0 && sumOdd%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}