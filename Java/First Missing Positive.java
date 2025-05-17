class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] sorted = Arrays.stream(nums).filter(x -> x > 0) .distinct().sorted().toArray();

        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] != i + 1) {
                return i + 1;
            }
        }

        return sorted.length + 1;
    }
}
