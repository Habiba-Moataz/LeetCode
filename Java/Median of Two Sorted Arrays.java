class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int[] merged = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if (merged.length%2==0){
            result = (merged[merged.length/2-1]+merged[merged.length/2])/2.0;
        }
        else {
             result = merged[(merged.length/2)];
        }
        return result;

    }
}
