class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];  // pull last element into this slot
                n--;                     // shrink the valid region
            } else {
                i++;                     // only advance when current slot is good
            }
        }
        return n;
    }
}   s