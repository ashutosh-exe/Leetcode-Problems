class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        long x=0;
        long sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                x = x*10+(s.charAt(i)-'0');
                sum = sum+(s.charAt(i)-'0');
            }
        }
        return x*sum;
    }
}