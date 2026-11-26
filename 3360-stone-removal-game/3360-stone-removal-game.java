class Solution {
    public boolean canAliceWin(int n) {
        int move = 10;
        int turn = 0;
        while(n >= move){
            n -= move;
            move--;
            turn++;
        }
        return turn % 2 == 1;
    }
}