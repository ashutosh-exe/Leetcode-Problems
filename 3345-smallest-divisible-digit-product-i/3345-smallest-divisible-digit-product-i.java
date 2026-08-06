class Solution {
    public int smallestNumber(int n, int t) {
        while(productOfDigits(n)%t != 0){
            n++;
        }
        return n;
    }
    private int productOfDigits(int n){
        int product = 1;
        while(n != 0){
            product *= n%10;
            n /= 10;
        }
        return product;
    }
}