class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for(char c:sentence.toCharArray()){
            arr[c-'a'] = true;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
}