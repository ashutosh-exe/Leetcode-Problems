class Solution {
    public boolean isPalindrome(String s) {
        String p = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] arr = new char[p.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = p.charAt(p.length()-(i+1));
        }
        return p.equals(String.valueOf(arr));
    }
}