class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int secondLargest = 0;
        while(n!=0){
            if(n%10>=largest){
                secondLargest = largest;
                largest = n%10;
            }else if(secondLargest<n%10){
                secondLargest = n%10;
            }
            n /= 10;
        }
        return largest * secondLargest;
    }
}