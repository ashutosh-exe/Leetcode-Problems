class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        int candySum = 0;
        for(int i=0;i<candies.length;i++){
            candySum = candies[i] + extraCandies;
            if(candySum>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}