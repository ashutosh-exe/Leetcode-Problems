class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}