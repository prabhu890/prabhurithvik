class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Create a new result array of size 2n
        int[] ans = new int[2 * n];
        
        // Loop through the first half and interleave elements
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];       // Places x_i at even indices (0, 2, 4...)
            ans[2 * i + 1] = nums[i + n]; // Places y_i at odd indices (1, 3, 5...)
        }
        
        return ans;
    }
}