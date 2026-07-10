class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int i=0;
        int m=0;
        int n=0;
        while(m<nums1.length && n<nums2.length){
            if(nums1[m]<nums2[n]){
                arr[i] = nums1[m];
                m++;
            }
            else{
                arr[i] = nums2[n];
                n++;
            }
            i++;
        }
        while(m<nums1.length){
            arr[i] = nums1[m];
            m++;
            i++;
        }
        while(n<nums2.length){
            arr[i] = nums2[n];
            n++;
            i++;
        }
        double ans = 0;
        if(arr.length % 2 == 1){
            ans = arr[(arr.length-1)/2];
        }
        else{
            ans = (double)(arr[(arr.length/2)-1]+arr[(arr.length/2)])/2;
        }
        return ans;
    }
}