class Solution {
    public int maximumGap(int[] nums) {
        int gap,maximumGap=0;
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            gap = nums[i+1]-nums[i];
            maximumGap= Math.max(maximumGap,gap);
        }
        return maximumGap;
    }
}
