class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int n = nums[i];
            while(n!=0){
                temp.add(n%10);
                n = n/10;
            }
            for(int j=temp.size()-1;j>=0;j--){
                ans.add(temp.get(j));
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}