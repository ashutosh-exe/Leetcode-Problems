class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high = Math.max(high, piles[i]);
        }

        while(low<=high) {

            int mid = low+(high-low)/2;

            long hours = 0;

            for(int i = 0; i < piles.length; i++){
                hours += piles[i] / mid;
                if (piles[i] % mid != 0) {
                    hours++;
                }
            }

            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}