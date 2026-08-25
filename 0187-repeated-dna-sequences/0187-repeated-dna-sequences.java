class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet();
        Set repeated = new HashSet();
        for(int i=0;i+9<s.length();i++){
            String t = s.substring(i,i+10);
            if(!seen.add(t)){
                repeated.add(t);
            }
        }
        return new ArrayList(repeated);
    }
}