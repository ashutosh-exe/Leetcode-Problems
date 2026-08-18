class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length){
            intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        List<Integer> arr = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ans = new int[arr.size()];
        for(int k=0;k<ans.length;k++){
            ans[k] = arr.get(k);
        }
        return ans;
    }
}