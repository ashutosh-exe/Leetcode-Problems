class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int r = 0;
        int c = 0;
        visited[r][c] = true;

        while(true){
            int nr = r;
            int nc = c;

            char dir = grid[nr][nc];
            if(dir == 'L'){
                nc--;
            }
            else if(dir=='R'){
                nc++;
            }
            else if(dir=='U'){
                nr--;
            }
            else{
                nr++;
            }
            if(nr<0 || nr>=m || nc<0 || nc>=n){
                break;
            }
            if(visited[nr][nc]){
                break;
            }
            r = nr;
            c = nc;

            visited[r][c] = true;
        }
        return new int[]{r,c};
    }
}