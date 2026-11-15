class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Deque<Character> st = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        int i = 0;
        while(i<ans.length() && ans.charAt(i)=='0'){
            i++;
        }
        String result = ans.substring(i);
        if(result.isEmpty()){
            return "0";
        }
        return result;
    }
}