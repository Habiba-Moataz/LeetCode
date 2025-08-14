class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int major = 1;
        int max_majority = 1;
        int majority = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                major++;
            } else {
                major = 1;
            }
            max_majority = Math.max(max_majority, major);
            if (max_majority == major) {
                majority = nums[i];
            }
        }
        return majority;
    }
}
