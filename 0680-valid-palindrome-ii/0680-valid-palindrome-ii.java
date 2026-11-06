class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return isPalindrome(s.substring(start+1,end+1)) || isPalindrome(s.substring(start,end));
            }
            start++;
            end--;
        }
        return true;
    }
    private boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}