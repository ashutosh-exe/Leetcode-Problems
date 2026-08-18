class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }     
        for(int num:nums2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}