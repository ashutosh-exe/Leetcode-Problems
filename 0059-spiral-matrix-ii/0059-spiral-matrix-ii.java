class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans[top][i] = count;
                count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right] = count;
                count++;
            }
            right--;
            for(int i=right;i>=left;i--){
                ans[bottom][i] = count;
                count++;
            }
            bottom--;
            for(int i=bottom;i>=top && left<=right;i--){
                ans[i][left] = count;
                count++;
            }
            left++;
        }
        return ans;
    }
}