class Solution {
    public int longestConsecutive(int[] nums) {
        int consecutive = 1, finalConsecutive = 0;
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    continue;
                } else if (nums[i] + 1 == nums[i + 1]) {
                    consecutive++;
                } else {
                    finalConsecutive = Math.max(finalConsecutive, consecutive);
                    consecutive = 1;
                }
            }
            return Math.max(finalConsecutive, consecutive);
        }
    }
}
