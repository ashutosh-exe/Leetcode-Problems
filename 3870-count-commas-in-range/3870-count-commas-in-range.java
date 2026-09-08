class Solution {
    public int countCommas(int n) {
        long ans = 0;
        long threshold = 1000;
        while(threshold<=n){
            ans += n-threshold+1;
            threshold *= 1000;
        }
        return (int) ans;
    }
}