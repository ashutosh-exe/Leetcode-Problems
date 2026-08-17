class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num:nums1){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int num:nums2){
            if(count.getOrDefault(num,0)>0){
                ans.add(num);
                count.put(num,count.get(num)-1);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}