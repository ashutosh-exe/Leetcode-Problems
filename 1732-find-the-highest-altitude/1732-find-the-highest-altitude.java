class Solution {
    public int largestAltitude(int[] gain) {
        int[] pre = new int[gain.length];
        pre[0] = gain[0];
        int maxAlt = 0;
        for(int i=1;i<gain.length;i++){
            pre[i] = pre[i-1]+gain[i];
        }
        for(int i=0;i<pre.length;i++){
            if(pre[i]>maxAlt){
                maxAlt = pre[i];
            }
        }
        return maxAlt;
    }
}