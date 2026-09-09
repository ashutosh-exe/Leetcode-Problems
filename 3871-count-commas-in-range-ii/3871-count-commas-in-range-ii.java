class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long res = 1000;
        while(res<=n){
            ans += n-res+1;
            if (res > Long.MAX_VALUE / 1000) {
                break;
            }
            res *= 1000;
        }
        return ans;
    }
}